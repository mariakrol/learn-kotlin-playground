package com.makrol.teamcity.ui.teamcity.page.objects.anonymous

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.Selenide.element
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.ProfilePage
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

class ResetPasswordPage : TeamCityPage() {
    fun resetPassword(newPassword: String?): ProfilePage {
        passwordField.value = newPassword
        confirmPasswordField.value = newPassword

        return open { submitPasswordButton.click() }
    }

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Reset password")
    private val headerLabel = element(byId("header"))

    @ImplicitCheck(isVisible = true)
    private val passwordField = element(byId("password1"))

    @ImplicitCheck(isVisible = true)
    private val confirmPasswordField = element(byId("retypedPassword"))

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Value, "Log in")
    private val submitPasswordButton = element(byCssSelector(".loginButton"))
}