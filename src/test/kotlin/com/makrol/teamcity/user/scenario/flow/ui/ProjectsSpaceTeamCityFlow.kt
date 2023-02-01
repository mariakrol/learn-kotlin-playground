package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.ProjectsPage
import com.makrol.teamcity.user.scenario.flow.ui.BuildTeamCityFlow
import io.qameta.allure.Step

open class ProjectsSpaceTeamCityFlow : AuthorizedTeamCityFlow {
    constructor(previous: AuthorizedTeamCityFlow) : super(previous)

    constructor(previous: TeamCityUiFlow, user: TestUser) : super(previous, user)

    @Step("Check Admin link visibility in header")
    fun checkAddProjectButtonVisibilityInBody(): AuthorizedTeamCityFlow {
        logger.info(
            "The logged-in user has${(if (user.isAdmin) "" else " no")} admin rights, "
                    + "so expected Admin link to be ${(if (user.isAdmin) "visible" else "hidden")}"
        )

        getProjectsPage().projectsView
            .assertAddProjectButtonVisibility(user.isAdmin)

        return this
    }

    @Step("Find project")
    fun findBuild(project: String, build: String): BuildTeamCityFlow {
        logger.info("Check if project '$project' with build '$build' is exist")
        val isProjectAvailable = getProjectsPage().isProjectAvailable(project)
        logger.info("Project ${(if (isProjectAvailable) "is" else "is not")} found!")
        assertions
            .assertThat(isProjectAvailable)
            .describedAs("Project is available")
            .isTrue

        logger.info("Check UI elements of the project")
        getProjectsPage().validateProjectUi(project)

        val isBuildAvailable = getProjectsPage().isBuildAvailable(project, build)
        logger.info("Build ${(if (isBuildAvailable) "is" else "is not")} found!")
        assertions
            .assertThat(isBuildAvailable)
            .describedAs("Project with build is available")
            .isTrue

        logger.info("Check UI elements of the build")
        getProjectsPage().validateBuildUi(project, build)

        return BuildTeamCityFlow(this, project, build)
    }

    protected fun getProjectsPage(): ProjectsPage {
        return currentPage as ProjectsPage
    }
}