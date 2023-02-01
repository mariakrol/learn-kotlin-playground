package com.makrol.teamcity.utilities.helpers.selenide

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.common.ComplexUiElement

fun SelenideElement.assertVisibility(isVisible: Boolean) {
    val condition: Condition = if (isVisible) Condition.visible else Condition.hidden

    this.should(condition)
}

fun SelenideElement.getAriaExpandedAttribute(): Boolean {
    return this.getDomAttribute("aria-expanded").toBoolean()
}

fun Any.asSelenideElement(): SelenideElement {
    if (this is SelenideElement) {
        return this
    }
    if (this is ComplexUiElement) {
        return this.innerElement
    }

    throw IllegalArgumentException("Cannot convert object $this of type ${this::class} to SelenideElement")
}