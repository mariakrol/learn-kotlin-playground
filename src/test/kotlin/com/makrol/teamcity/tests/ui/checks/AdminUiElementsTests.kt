package com.makrol.teamcity.tests.ui.checks

import com.makrol.teamcity.tests.TeamCityTestsBase
import com.makrol.teamcity.user.scenario.flow.AnonymousTeamCityFlow
import io.qameta.allure.Feature
import io.qameta.allure.Owner
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@Owner("makrol")
@DisplayName("Admin UI elements on Profile page")
class AdminUiElementsTests : TeamCityTestsBase() {

    @Feature("AdminUiElements")
    @DisplayName("should be visible or hidden based on user's admin rights")
    @ParameterizedTest(name = "{index} => is admin rights = {0}")
    @ValueSource(booleans = [true, false])
    fun adminUserUi(isAdminRights: Boolean) {
        userToBeLoggedIn = userApi.createUser(isAdminRights)

        AnonymousTeamCityFlow
            .start(assertions)
            .validateCurrentPage()
            .login(userToBeLoggedIn)
            .validateCurrentPage()
            .checkAddProjectButtonVisibilityInHeader()
            .checkAdminLinkVisibility()
            .asProjectsFlow()
            .checkAddProjectButtonVisibilityInBody()
    }
}