package com.makrol.teamcity.ui.teamcity.page.objects.anonymous.login.page

import com.codeborne.selenide.Selectors.*
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

class LoginForm : ComplexUiElement(byClassName("loginForm")) {
    fun fillCredentials(userName: String, password: String) {
        userNameField.value = userName
        passwordField.value = password
    }

    fun login() {
        loginButton.click()
    }

    fun resetPassword() {
        resetPasswordLink.click()
    }

    @ImplicitCheck(isVisible = true)
    private val userNameField = getChild(byId("username"))

    @ImplicitCheck(isVisible = true)
    private val passwordField = getChild(byId("password"))

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Value, "Log in")
    private val loginButton = getChild(byClassName("loginButton"))

    @ImplicitCheck(isVisible = true)
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Reset password")
    private val resetPasswordLink = getChild(byCssSelector("#resetPasswordContainer a"))
}