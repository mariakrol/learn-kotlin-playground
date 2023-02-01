package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.LoggedInPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu.UserMenuItem
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.ProfilePage
import com.makrol.teamcity.user.scenario.flow.exceptions.UnexpectedFlowState
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

    @Step("Validate elements on currently open page")
    override fun validateCurrentPage(): AuthorizedTeamCityFlow {
        logger.info("Check elements visibility for page: ${currentPage::class.simpleName}")
        validatePage()

        return this
    }

    @Step("Check Add project button visibility in header")
    fun checkAddProjectButtonVisibilityInHeader(): AuthorizedTeamCityFlow {
        logger.info(
            "The logged-in user has${(if (user.isAdmin) "" else " no")} admin rights, "
                    + "so expected button to be ${(if (user.isAdmin) "visible" else "hidden")}"
        )

        getLoggedInPage().header
            .assertAddProjectButtonVisibility(user.isAdmin)

        return this
    }

    @Step("Check Admin link visibility in header")
    fun checkAdminLinkVisibility(): AuthorizedTeamCityFlow {
        logger.info(
            "The logged-in user has${(if (user.isAdmin) "" else " no")} admin rights, " +
                    "so expected Admin link to be ${(if (user.isAdmin) "visible" else "hidden")}"
        )

        getLoggedInPage().header
            .assertAdminLinkVisibility(user.isAdmin)

        return this
    }

    fun asProjectsFlow(): ProjectsSpaceTeamCityFlow {
        if (this is ProjectsSpaceTeamCityFlow) {
            return this
        }

        throw UnexpectedFlowState("Cannot convert current flow to Projects flow")
    }

    private fun getLoggedInPage(): LoggedInPage {
        return currentPage as LoggedInPage
    }
}