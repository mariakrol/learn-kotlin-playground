package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements

import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.Selenide
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

class GeneralSettingsSection : ProfilePageSection() {
    fun getUserName(): String {
        return userNameReadOnlyField.text
    }

    fun getName(): String {
        return nameField.value ?: ""
    }

    fun getEmail(): String {
        return emailField.value ?: ""
    }

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "General")
    private val sectionHeader = Selenide.element(byId("restPageTitle"))

    @ImplicitCheck(isVisible = true)
    private val userNameReadOnlyField = Selenide.element(byId("text_teamcityUsername"))

    @ImplicitCheck(isVisible = true)
    private val nameField = Selenide.element(byId("name"))

    @ImplicitCheck(isVisible = true)
    private val emailField = Selenide.element(byId("input_teamcityEmail"))
}

