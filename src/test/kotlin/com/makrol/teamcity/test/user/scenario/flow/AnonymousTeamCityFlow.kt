package com.makrol.teamcity.test.user.scenario.flow

import io.qameta.allure.Step

class AnonymousTeamCityFlow : TeamCityUiFlow() {


    @Step("Login to TeamCity")
    fun login(login: String, password: String): ProfileSpaceTeamCityFlow {
        logger.info("Login to TeamCity with ${login}/${password}")
        TODO("Not implemented")

        return ProfileSpaceTeamCityFlow()
    }
}

