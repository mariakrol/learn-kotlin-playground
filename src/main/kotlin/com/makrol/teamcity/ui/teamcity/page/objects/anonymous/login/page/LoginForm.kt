package com.makrol.teamcity.ui.teamcity.page.objects.anonymous.login.page

import com.codeborne.selenide.Selectors.*
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.common.ComplexUiElement
import org.openqa.selenium.By

class LoginForm : ComplexUiElement(By.className("loginForm")) {
    fun fillCredentials(userName: String, password: String) {
        userNameField.value = userName
        passwordField.value = password
    }

    fun login() {
        loginButton.click()
    }

    @ImplicitCheck(isVisible = true)
    private val userNameField = getChild(byId("username"))

    @ImplicitCheck(isVisible = true)
    private val passwordField = getChild(byId("password"))

    @ImplicitCheck(isVisible = true)
    private val loginButton = getChild(byClassName("loginButton"))

    @ImplicitCheck(isVisible = true)
    private val resetPasswordLink = getChild(byCssSelector("#resetPasswordContainer a"))
}