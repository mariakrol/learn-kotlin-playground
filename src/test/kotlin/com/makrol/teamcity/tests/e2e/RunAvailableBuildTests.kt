package com.makrol.teamcity.tests.e2e

import com.makrol.teamcity.api.wrapper.ProjectsApiWrapper
import com.makrol.teamcity.data.models.TestTeamCityProject
import com.makrol.teamcity.tests.TeamCityTestsBase
import com.makrol.teamcity.user.scenario.flow.AnonymousTeamCityFlow
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import io.qameta.allure.Feature
import io.qameta.allure.Owner
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

@Owner("makrol")
@DisplayName("Logged-in user can run build")
class RunAvailableBuildTests : TeamCityTestsBase() {
    private lateinit var teamCityProject: TestTeamCityProject
    private val projectsApiHelper: ProjectsApiWrapper = ProjectsApiWrapper()

    @BeforeEach
    fun createTeamCityProject() {
        teamCityProject = projectsApiHelper.createSimpleTeamCityProject(ConfigurationProvider.testRepo)
    }

    //ToDo: try to get rid of @before each and use private val teamCityProject = projectsApiHelper.createSimpleTeamCityProject(ConfigurationProvider.testRepo)

    //ToDo: split tests first run, several runs
    @Feature("RunBuild")
    @DisplayName("on Projects page, which was never run before")
    @Test
    fun regularUserCanRunAvailableBuild() {
        userToBeLoggedIn = userApi.createUser()

        val expectedDuration: Duration = 60.seconds //ToDo: move value to config
        AnonymousTeamCityFlow.start(assertions)
            .login(userToBeLoggedIn)//ToDo: need to put cookie instead of real login for non-login tests
            .findBuild(teamCityProject.projectName, teamCityProject.buildTypeName)
            .assertBuildNeverRun()
            .runBuild()
            .waitFinished(expectedDuration)
            .assertBuildResult(
                buildNumber = 1,
                ConfigurationProvider.testRepo.mainBranch, expectedDuration,
                isSucceeded = true
            )
    }

    @AfterEach
    fun deleteProject() {
        projectsApiHelper.deleteProject(teamCityProject)
    }
}