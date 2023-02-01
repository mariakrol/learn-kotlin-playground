package com.makrol.teamcity.ui.teamcity.page.objects.anonymous

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.Selenide.element
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

@PageUrlPath("/forgotPassword.html")
class ForgotPasswordPage : TeamCityPage() {
    fun resetPassword(email: String?) {
        emailField.value = email
        nextButton.click()
    }

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Reset password")
    private val headerLabel = element(byId("header"))

    @ImplicitCheck(isVisible = true)
    private val emailField = element(byId("input_email"))

    @ImplicitCheck(isVisible = true)
    private val nextButton = element(byCssSelector(".loginButton"))
}