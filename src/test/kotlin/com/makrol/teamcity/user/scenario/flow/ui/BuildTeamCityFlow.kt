package com.makrol.teamcity.user.scenario.flow.ui

import io.qameta.allure.Step
import kotlin.time.Duration

class BuildTeamCityFlow(previous: ProjectsSpaceTeamCityFlow, private val project: String, private val build: String) :
    ProjectsSpaceTeamCityFlow(previous) {

    @Step("Check that the build was never run before")
    fun assertBuildNeverRun(): BuildTeamCityFlow {
        assertions.assertThat(getProjectsPage().getLatestRunInformation(project, build))
            .describedAs("Finished run information")
            .isNull()

        return this
    }

    @Step("Run build")
    fun runBuild(): BuildTeamCityFlow {
        getProjectsPage()
            .runBuild(project, build)

        return this
    }

    @Step("Wait the build is finished")
    fun waitFinished(expectedDuration: Duration): BuildTeamCityFlow {
        getProjectsPage()
            .waitRunFinish(project, build, expectedDuration)

        return this
    }

    @Step("Assert build information is expected")
    fun assertBuildResult(
        buildNumber: Int,
        branch: String,
        maxDuration: Duration,
        isSucceeded: Boolean
    ): BuildTeamCityFlow {

        val actualBuildInfo = getProjectsPage().getLatestRunInformation(project, build)
        assertions.assertThat(actualBuildInfo)
            .isNotNull
        assertions.assertThat(actualBuildInfo?.number)
            .isEqualTo(buildNumber)
        assertions.assertThat(actualBuildInfo?.branch)
            .isEqualTo(branch)
        assertions.assertThat(actualBuildInfo?.durationSec)
            .isLessThan(maxDuration.inWholeSeconds)
        assertions.assertThat(actualBuildInfo?.isSucceeded)
            .isEqualTo(isSucceeded)

        return this
    }
}