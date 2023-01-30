package com.makrol.teamcity.ui.teamcity.page.objects.login.page

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

    private val userNameField = getChild(By.id("username"))

    private val passwordField = getChild(By.id("password"))

    private val loginButton = getChild(By.className("loginButton"))

    private val resetPasswordLink = getChild(By.cssSelector("#resetPasswordContainer a"))
}