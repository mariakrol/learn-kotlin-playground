package com.makrol.teamcity.tests.e2e

import com.makrol.teamcity.tests.TeamCityTestsBase
import com.makrol.teamcity.user.scenario.flow.AnonymousTeamCityFlow
import io.qameta.allure.Feature
import io.qameta.allure.Owner
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@Owner("makrol")
@DisplayName("Login with existing credentials")
class ExistingUserLoginTests : TeamCityTestsBase() {
    @Feature("Login")
    @DisplayName("should lead to logged-in space started from the Projects page and give access to the Profile with expected user data")
    @ParameterizedTest(name = "{index} => is admin rights = {0}, email is set = {1}, name is set = {2}")
    @CsvSource(
        "true, true, true",
        "false, true, false",
        "true, false, true",
        "false, false, false"
    )
    fun shouldGoToLoggedInSpace(isAdminRights: Boolean, isEmailSet: Boolean, isNameSet: Boolean) {
        userToBeLoggedIn = userApi.createUser(isAdminRights, isEmailSet, isNameSet)

        AnonymousTeamCityFlow
            .start(assertions)
            .login(userToBeLoggedIn)
            .goToProfile()
            .validateUserInfo()
    }
}