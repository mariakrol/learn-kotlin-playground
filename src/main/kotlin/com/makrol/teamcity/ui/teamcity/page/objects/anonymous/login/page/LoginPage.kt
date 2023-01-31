package com.makrol.teamcity.ui.teamcity.page.objects.anonymous.login.page

import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.ProjectsPage

@PageUrlPath("/login.html")
class LoginPage : TeamCityPage() {
    fun login(userName: String, password: String): ProjectsPage {
        loginForm.fillCredentials(userName, password)

        return open { loginForm.login() }
    }

    private val loginForm = LoginForm()
}