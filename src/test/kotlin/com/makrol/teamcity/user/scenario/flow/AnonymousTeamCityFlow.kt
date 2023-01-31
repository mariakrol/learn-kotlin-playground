package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.anonymous.login.page.LoginPage
import com.makrol.teamcity.user.scenario.flow.exceptions.UnexpectedFlowState
import com.makrol.teamcity.utilities.helpers.selenide.validateElementsVisibility
import io.qameta.allure.Step
import org.assertj.core.api.SoftAssertions

class AnonymousTeamCityFlow private constructor(assertions: SoftAssertions, currentPage: TeamCityPage) :
    TeamCityUiFlow(assertions, currentPage) {
    @Step("Login to TeamCity")
    fun login(user: TestUser): ProjectsSpaceTeamCityFlow {
        logger.info("Login to TeamCity with $user")

        if (currentPage is LoginPage) {
            currentPage = (currentPage as LoginPage).login(user.userName, user.password)
            logger.info("User is logged in")

            return ProjectsSpaceTeamCityFlow(this, user)
        } else {
            throw UnexpectedFlowState("Expected, that current open page is Login, but found ${currentPage::class}")
        }
    }

    @Step("Validate elements on currently open page")
    override fun validateCurrentPage(): AnonymousTeamCityFlow {
        logger.info("Check elements visibility for page: ${currentPage::class.simpleName}")
        currentPage.validateElementsVisibility()

        return this
    }

    companion object {
        fun start(assertions: SoftAssertions): AnonymousTeamCityFlow {
            val loginPage = TeamCityPage.open<LoginPage>()

            return AnonymousTeamCityFlow(assertions, loginPage)
        }
    }
}

