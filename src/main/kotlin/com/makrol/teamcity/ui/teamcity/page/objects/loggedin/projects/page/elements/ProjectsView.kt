package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.elements

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.utilities.helpers.selenide.assertVisibility
import com.makrol.teamcity.utilities.helpers.selenide.createElementByLocalizedText
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

class ProjectsView : ComplexUiElement(byId("main-content-tag")) {
    fun assertAddProjectButtonVisibility(isVisible: Boolean) {
        addProjectButton.assertVisibility(isVisible)
    }

    fun getProjectContainerElements(): List<ProjectContainer>? {
        return getChildren(byCssSelector(".Subproject__container--WE"), minCount = 1) //ToDo: change locator
    }

    @LocalizedElement(Language.En, TextDomAttribute.Text, "New project...")
    private val addProjectButton: SelenideElement = this.createElementByLocalizedText(
        this::addProjectButton,
        ".//a[.//*[text()='%s']]"
    )
}