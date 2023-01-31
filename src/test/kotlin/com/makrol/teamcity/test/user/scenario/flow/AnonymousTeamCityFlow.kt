package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.test.user.scenario.flow.exceptions.UnexpectedFlowState
import com.makrol.teamcity.ui.common.Page
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.anonymous.login.page.LoginPage
import io.qameta.allure.Step

class AnonymousTeamCityFlow private constructor(currentPage: Page) : TeamCityUiFlow(currentPage) {
    @Step("Login to TeamCity")
    fun login(login: String, password: String): ProjectsSpaceTeamCityFlow {
        logger.info("Login to TeamCity with ${login}/${password}")

        if (currentPage is LoginPage) {
            val projectsPage = currentPage.login(login, password)
            logger.info("User is logged in")

            return ProjectsSpaceTeamCityFlow(projectsPage)
        } else {
            throw UnexpectedFlowState("Expected, that current open page is Login, but found ${currentPage::class}")
        }
    }

    companion object {
        fun start(): AnonymousTeamCityFlow {
            val loginPage = TeamCityPage.open<LoginPage>()

            return AnonymousTeamCityFlow(loginPage)
        }
    }
}

