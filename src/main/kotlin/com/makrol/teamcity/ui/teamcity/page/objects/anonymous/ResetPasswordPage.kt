package com.makrol.teamcity.ui.teamcity.page.objects.anonymous

import com.codeborne.selenide.Selenide
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.ProfilePage
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute
import org.openqa.selenium.By

class ResetPasswordPage : TeamCityPage() {
    fun resetPassword(newPassword: String?): ProfilePage {
        passwordField.value = newPassword
        confirmPasswordField.value = newPassword

        return open { submitPasswordButton.click() }
    }

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Reset password")
    private val headerLabel = Selenide.element(By.id("header"))

    @ImplicitCheck(isVisible = true)
    private val passwordField = Selenide.element(By.id("password1"))

    @ImplicitCheck(isVisible = true)
    private val confirmPasswordField = Selenide.element(By.id("retypedPassword"))

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Value, "Log in")
    private val submitPasswordButton = Selenide.element(By.cssSelector(".loginButton"))
}