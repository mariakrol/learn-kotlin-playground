package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import io.qameta.allure.Step

class ProfileSpaceTeamCityFlow : AuthorizedTeamCityFlow {
    constructor(previous: AuthorizedTeamCityFlow) : super(previous)

    constructor(previous: TeamCityUiFlow, user: TestUser) : super(previous, user)

    @Step("Validate user information for the logged-in user")
    fun validateUserInfo(): ProfileSpaceTeamCityFlow {
        logger.info("Assert user information from Profile page")
        TODO("Not implemented")

        return this
    }
}