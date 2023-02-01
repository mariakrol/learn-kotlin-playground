package com.makrol.teamcity.ui.common

import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide.elements
import com.makrol.teamcity.utilities.localization.LocalizedItem
import org.openqa.selenium.By

//ToDo: get rid or copy/paste -> Menu
abstract class SideBar<TSideBarItem>(
    private val itemsClass: Class<TSideBarItem>,
    locator: By,
    private val itemLocator: By
) : ComplexUiElement(locator)
        where TSideBarItem : Enum<TSideBarItem>, TSideBarItem : LocalizedItem {

    open fun clickOnItem(item: TSideBarItem) {
        val text = item.getLocalization().text
        getItems()
            .first { it.text() == text }
            .click()
    }

    fun validateMenuItems() {
        val itemsExpectedText = itemsClass.enumConstants
            .map { (it as TSideBarItem).getLocalization().text }

        getItems()
            .shouldHave(CollectionCondition.size(itemsExpectedText.size))
            .shouldHave(CollectionCondition.exactTexts(itemsExpectedText))
    }

    private fun getItems(): ElementsCollection {
        return elements(itemLocator)
    }
}