package com.makrol.teamcity.test.e2e

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.test.user.scenario.flow.AnonymousTeamCityFlow
import io.qameta.allure.Feature
import io.qameta.allure.Owner
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@Owner("makrol")
@DisplayName("Login with existing credentials")
class ExistingUserLoginTests {
    @Feature("Login")
    @DisplayName("should lead to logged-in space started from the Projects page and give access to the Profile with expected user data")
    @Test
    fun shouldGoToLoggedInSpace() {
        val user = TestUser("John", "John Doe", "Pa77w0rd", isAdmin = true) //ToDo: create user before test

        AnonymousTeamCityFlow
            .start()
            .login(user)
            .goToProfile()
            .validateUserInfo()
    }
}