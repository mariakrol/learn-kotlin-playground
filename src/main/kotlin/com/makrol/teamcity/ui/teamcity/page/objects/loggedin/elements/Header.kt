package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selectors.byText
import com.codeborne.selenide.Selenide
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu.UserMenu

class Header : ComplexUiElement(byCssSelector(".ring-header-header")) {
    fun getUserMenu(): UserMenu {
        return userMenu
    }

    private val projectsLinkContainer = Selenide.element(byText("Projects"))

    private val changesLinkContainer = Selenide.element(byText("Changes"))

    private val agentsLinkContainer = Selenide.element(byText("Agents"))

    private val queueLinkContainer = Selenide.element(byText("Queue"))

    private val helpButton = Selenide.element(byCssSelector("[title='Help']"))

    private val administrationLink =
        Selenide.element(byCssSelector("[data-hint-container-id='header-administration-link']"))

    private val userMenu = UserMenu()
}