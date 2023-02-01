package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page

import com.makrol.teamcity.data.models.BuildInformation
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.LoggedInPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.elements.BuildContainer
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.elements.ProjectsView
import com.makrol.teamcity.utilities.helpers.selenide.validateElementsVisibility
import kotlin.time.Duration

@PageUrlPath("/favorite/projects")
class ProjectsPage : LoggedInPage() {
    fun isProjectAvailable(projectName: String): Boolean {
        projectsView
            .checkVisible()

        return projectsView
            .getProjectContainerElements()
            ?.any { it.getName() == projectName } ?: false
    }

    fun validateProjectUi(projectName: String) {
        projectsView
            .getProjectContainerElements()
            ?.first { it.getName() == projectName }!!
            .validateElementsVisibility()
    }

    fun isBuildAvailable(projectName: String, buildName: String): Boolean {
        return try {
            findBuild(projectName, buildName)
                .checkExists()

            true
        } catch (e: RuntimeException) {
            false
        }
    }

    fun validateBuildUi(projectName: String, buildName: String) {
        findBuild(projectName, buildName)
            .validateElementsVisibility()
    }

    fun getLatestRunInformation(projectName: String, buildName: String): BuildInformation? {
        return findBuild(projectName, buildName).getRunInfo()
    }

    fun waitRunFinish(projectName: String, buildName: String, expectedDurationSec: Duration) {
        findBuild(projectName, buildName).waitFinish(expectedDurationSec)
    }

    fun runBuild(projectName: String, buildName: String) {
        findBuild(projectName, buildName).run()
    }

    private fun findBuild(projectName: String, buildName: String): BuildContainer {
        val project = projectsView
            .getProjectContainerElements()
            ?.firstOrNull { it.getName() == projectName }
            ?: throw RuntimeException() //ToDo: add custom
        project.expandIfNot()
        val builds = project.getBuildContainerElements()
        return builds
            ?.firstOrNull { it.getName() == buildName }
            ?: throw RuntimeException() //ToDo: add custom
    }

    @ImplicitCheck(isVisible = true)
    val projectsView = ProjectsView()
}