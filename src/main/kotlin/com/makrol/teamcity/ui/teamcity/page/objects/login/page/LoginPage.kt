package com.makrol.teamcity.ui.teamcity.page.objects.login.page

import com.makrol.teamcity.ui.common.Page
import com.makrol.teamcity.ui.teamcity.page.objects.ProjectsPage

class LoginPage : Page() {
    fun login(userName: String, password: String): ProjectsPage {
        loginForm.fillCredentials(userName, password)
        loginForm.login()

        TODO("Implement open of page")

        return ProjectsPage()
    }

    private val loginForm = LoginForm()
}