package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.LoggedInPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.ProfilePage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu.UserMenuItem
import io.qameta.allure.Step

abstract class AuthorizedTeamCityFlow : TeamCityUiFlow {

    constructor(previous: AuthorizedTeamCityFlow) : super(previous) {
        this.user = previous.user
    }

    constructor(previous: TeamCityUiFlow, user: TestUser) : super(previous) {
        this.user = user
    }

    protected val user: TestUser


    @Step("Open Profile page")
    fun goToProfile(): ProfileSpaceTeamCityFlow {
        logger.info("Open profile for logged-in user")
        currentPage = getLoggedInPage().openPageByUserMenu<ProfilePage>(UserMenuItem.Profile)

        return ProfileSpaceTeamCityFlow(this)
    }

    private fun getLoggedInPage(): LoggedInPage {
        return currentPage as LoggedInPage
    }
}