package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.ProjectsPage
import io.qameta.allure.Step

class ProjectsSpaceTeamCityFlow : AuthorizedTeamCityFlow {
    constructor(previous: AuthorizedTeamCityFlow) : super(previous)

    constructor(previous: TeamCityUiFlow, user: TestUser) : super(previous, user)

    @Step("Check Admin link visibility in header")
    fun checkAddProjectButtonVisibilityInBody(): AuthorizedTeamCityFlow {
        logger.info("The logged-in user has${(if (user.isAdmin) "" else " no")} admin rights, "
                    + "so expected Admin link to be ${(if (user.isAdmin) "visible" else "hidden")}")

        getProjectsPage().projectsView
            .assertAddProjectButtonVisibility(user.isAdmin)

        return this
    }

    private fun getProjectsPage(): ProjectsPage {
        return currentPage as ProjectsPage
    }
}