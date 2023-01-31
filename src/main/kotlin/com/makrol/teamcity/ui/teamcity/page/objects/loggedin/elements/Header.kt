package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu.UserMenu
import com.makrol.teamcity.utilities.helpers.selenide.assertVisibility
import com.makrol.teamcity.utilities.helpers.selenide.createElementByLocalizedText
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

class Header : ComplexUiElement(byCssSelector(".ring-header-header")) {
    fun getUserMenu(): UserMenu {
        return userMenu
    }

    fun assertAddProjectButtonVisibility(isVisible: Boolean) {
        addProjectButton.assertVisibility(isVisible)
    }

    fun assertAdminLinkVisibility(isVisible: Boolean) {
        administrationLink.assertVisibility(isVisible)
    }

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Projects")
    private val projectsLinkContainer: SelenideElement = this.createElementByLocalizedText(this::projectsLinkContainer)

    private val addProjectButton = element(byCssSelector("[aria-label='Create subproject']"))

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Changes")
    private val changesLinkContainer: SelenideElement = this.createElementByLocalizedText(this::changesLinkContainer)

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Agents")
    private val agentsLinkContainer: SelenideElement = this.createElementByLocalizedText(this::agentsLinkContainer)

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Queue")
    private val queueLinkContainer: SelenideElement = this.createElementByLocalizedText(this::queueLinkContainer)

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Title, "Help")
    private val helpButton: SelenideElement = this.createElementByLocalizedText(this::helpButton)

    private val administrationLink = element(byCssSelector("[data-hint-container-id='header-administration-link']"))

    private val userMenu = UserMenu()
}