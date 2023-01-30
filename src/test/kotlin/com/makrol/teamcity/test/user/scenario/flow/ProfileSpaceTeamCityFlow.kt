package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.ui.common.Page
import io.qameta.allure.Step

class ProfileSpaceTeamCityFlow(currentPage: Page) : TeamCityUiFlow(currentPage) {
    @Step("Validate user information for the logged-in user")
    fun validateUserInfo(): ProfileSpaceTeamCityFlow {
        logger.info("Assert user information from Profile page")
        TODO("Not implemented")

        return this
    }
}