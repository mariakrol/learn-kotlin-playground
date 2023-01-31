package com.makrol.teamcity.ui.common

import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide
import org.openqa.selenium.By

//ToDo: derive from container
abstract class Menu<TMenuItem>(private val itemsSource: Class<TMenuItem>, menuLocator: By, private val itemLocator: By)
        where TMenuItem : Enum<TMenuItem>, TMenuItem : LocalizedItem {

    protected val menuExpander = Selenide.element(menuLocator)

    fun clickOnItem(item: TMenuItem) {
        expand()
        getItems()
            .first { it.text() == item.getLocalization().text }
            .click()
    }

    private fun expand() {
        menuExpander.click()
    }

    private fun collapse() {
        menuExpander.pressEscape()
    }

    private fun getItems(): ElementsCollection {
        return Selenide.elements(itemLocator)
    }
}