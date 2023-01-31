package com.makrol.teamcity.test.user.scenario.flow

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

    private fun getProfilePage(): ProfilePage {
        return currentPage as ProfilePage
    }
}