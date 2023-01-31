package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page

import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.utilities.helpers.selenide.createElementByLocalizedText
import com.makrol.teamcity.utilities.helpers.selenide.assertVisibility
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute
import org.openqa.selenium.By

class ProjectsView : ComplexUiElement(By.tagName("main")) {
    fun assertAddProjectButtonVisibility(isVisible: Boolean) {
        addProjectButton.assertVisibility(isVisible)
    }

    @LocalizedElement(Language.En, TextDomAttribute.Text, "New project...")
    private val addProjectButton: SelenideElement = this.createElementByLocalizedText(this::addProjectButton,
        ".//a[.//*[text()='%s']]")
}