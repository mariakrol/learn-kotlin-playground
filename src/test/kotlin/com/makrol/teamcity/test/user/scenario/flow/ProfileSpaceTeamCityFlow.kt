package com.makrol.teamcity.test.user.scenario.flow

import io.qameta.allure.Step

class ProfileSpaceTeamCityFlow : TeamCityUiFlow() {
    @Step("Open Profile page")
    fun goToProfile(): ProfileSpaceTeamCityFlow {
        logger.info("Open profile for logged-in user")
        TODO("Not implemented")

        return this
    }

    @Step("Validate user information for the logged-in user")
    fun validateUserInfo(): ProfileSpaceTeamCityFlow {
        logger.info("Assert user information from Profile page")
        TODO("Not implemented")

        return this
    }
}