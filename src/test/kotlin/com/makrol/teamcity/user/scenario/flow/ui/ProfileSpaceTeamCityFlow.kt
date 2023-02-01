package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.ProfilePage
import io.qameta.allure.Step

class ProfileSpaceTeamCityFlow : AuthorizedTeamCityFlow {
    constructor(previous: AuthorizedTeamCityFlow) : super(previous)

    constructor(previous: TeamCityUiFlow, user: TestUser) : super(previous, user)

    @Step("Validate user information for the logged-in user")
    fun validateUserInfo(): ProfileSpaceTeamCityFlow {
        logger.info("Validate user info on Profile page")
        val expectedProfileInfo = user.toProfileInfo()
        val currenProfileInfo = getProfilePage().getProfileInfo()

        assertions
            .assertThat(currenProfileInfo)
            .isEqualTo(expectedProfileInfo)

        return this
    }

    @Step("Check message is visible on Profile page")
    fun validateSuccessMessage(expectedMessage: String): ProfileSpaceTeamCityFlow {
        val actualMessage = getProfilePage().getSuccessMessage()
        assertions.assertThat(actualMessage)
            .describedAs("Label with status of reset password operation")
            .isEqualTo(expectedMessage)

        return this
    }

    private fun getProfilePage(): ProfilePage {
        return currentPage as ProfilePage
    }
}