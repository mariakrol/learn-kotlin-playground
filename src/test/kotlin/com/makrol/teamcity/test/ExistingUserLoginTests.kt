package com.makrol.teamcity.test

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
        TODO("Not implemented yet")
    }
}