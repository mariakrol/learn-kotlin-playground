package com.makrol.teamcity.ui.common

import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By

abstract class ComplexUiElement(locator: By) : UiElementContainer {
    val innerElement = element(locator)

    protected fun getChild(locator: By): SelenideElement {
        return innerElement.find(locator)
    }
}