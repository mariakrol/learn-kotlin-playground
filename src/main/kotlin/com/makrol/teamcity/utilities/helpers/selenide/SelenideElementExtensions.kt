package com.makrol.teamcity.utilities.helpers.selenide

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement

fun SelenideElement.assertVisibility(isVisible: Boolean) {
    val condition: Condition = if (isVisible) Condition.visible else Condition.hidden
    this.should(condition)
}