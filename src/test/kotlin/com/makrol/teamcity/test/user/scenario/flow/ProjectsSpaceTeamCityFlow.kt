package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.ui.common.Page
import io.qameta.allure.Step

class ProjectsSpaceTeamCityFlow(currentPage: Page) : TeamCityUiFlow(currentPage) {
    @Step("Open Profile page")
    fun goToProfile(): ProfileSpaceTeamCityFlow {
        logger.info("Open profile for logged-in user")
        TODO("Not implemented")

        return ProfileSpaceTeamCityFlow(currentPage)
    }
}