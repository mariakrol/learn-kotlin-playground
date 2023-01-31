package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements

import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.Selenide

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

    private val sectionHeader = Selenide.element(byId("restPageTitle"))

    private val userNameReadOnlyField = Selenide.element(byId("text_teamcityUsername"))

    private val nameField = Selenide.element(byId("name"))

    private val emailField = Selenide.element(byId("input_teamcityEmail"))
}

