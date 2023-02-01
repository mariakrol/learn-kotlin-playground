package com.makrol.teamcity.ui.common

import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Condition.exist
import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.utilities.helpers.createObjectWithParameter
import org.openqa.selenium.By

abstract class ComplexUiElement : UiElementContainer {
    constructor(locator: By) {
        innerElement = element(locator)
    }

    constructor(innerElement: SelenideElement) {
        this.innerElement = innerElement
    }

    val innerElement: SelenideElement

    protected fun getChild(locator: By): SelenideElement {
        return innerElement.find(locator)
    }

    protected inline fun <reified TElement : ComplexUiElement> getChildren(
        locator: By,
        minCount: Int? = null
    ): List<TElement>? {
        val rawElements = innerElement.findAll(locator)
        if (minCount != null) {
            rawElements.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(minCount))
        }
        if (!rawElements.any()) {
            return null
        }

        return rawElements
            .map { createObjectWithParameter<TElement, SelenideElement>(it) }
            .toList()
    }

    fun checkExists() {
        innerElement.should(exist)
    }

    fun checkVisible() {
        innerElement.shouldBe(visible)
    }
}