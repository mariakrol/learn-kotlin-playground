package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.test.user.scenario.flow.exceptions.UnexpectedFlowState
import com.makrol.teamcity.ui.common.Page
import com.makrol.teamcity.ui.teamcity.page.objects.login.page.LoginPage
import io.qameta.allure.Step
import java.net.URL

class AnonymousTeamCityFlow private constructor(currentPage: Page) : TeamCityUiFlow(currentPage) {
    @Step("Login to TeamCity")
    fun login(login: String, password: String): ProjectsSpaceTeamCityFlow {
        logger.info("Login to TeamCity with ${login}/${password}")

        if (currentPage is LoginPage) {
            return ProjectsSpaceTeamCityFlow(currentPage.login(login, password))
        } else {
            throw UnexpectedFlowState("Expected, that current open page is Login, but found ${currentPage::class}")
        }
    }

    companion object {
        fun start(): AnonymousTeamCityFlow {
            val loginPage = Page.open<LoginPage>(URL("http://localhost:8111/login.html"))

            return AnonymousTeamCityFlow(loginPage)
        }
    }
}

