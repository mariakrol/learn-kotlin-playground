package com.makrol.teamcity.ui.teamcity.page.objects.login.page

import com.makrol.teamcity.ui.common.Page
import com.makrol.teamcity.ui.teamcity.page.objects.ProjectsPage

class LoginPage : Page() {
    fun login(userName: String, password: String): ProjectsPage {
        loginForm.fillCredentials(userName, password)

        return open { loginForm.login() }
    }

    private val loginForm = LoginForm()
}