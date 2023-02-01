package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.elements

import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selectors.byTagName
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.utilities.helpers.selenide.getAriaExpandedAttribute

class ProjectContainer(rawElement: SelenideElement) : ComplexUiElement(rawElement) {
    fun getName(): String {
        projectNameLabel
            .shouldBe(visible)

        return projectNameLabel.text()
    }

    fun expandIfNot() {
        if (!isExpanded()) {
            expandArrow.click()
        }
    }

    private fun isExpanded(): Boolean {
        return detailsButton.getAriaExpandedAttribute()
    }

    @ImplicitCheck(isVisible = false)
    private val detailsButton = getChild(byCssSelector(".Details__asideButton--GB"))  //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val expandArrow = getChild(byCssSelector(".Subproject__arrow--KJ"))  //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val projectNameLabel = getChild(byTagName("h2"))

    internal fun getBuildContainerElements(): List<BuildContainer>? {
        return getChildren(byCssSelector(".Subproject__details--ro"), minCount = 1) //ToDo: change locator
    }
}