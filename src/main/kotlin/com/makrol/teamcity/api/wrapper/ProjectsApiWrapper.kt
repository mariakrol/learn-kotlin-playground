package com.makrol.teamcity.api.wrapper

import com.makrol.teamcity.api.swagger.client.api.BuildTypeApi
import com.makrol.teamcity.api.swagger.client.api.ProjectApi
import com.makrol.teamcity.api.swagger.client.api.VcsRootApi
import com.makrol.teamcity.api.swagger.client.model.*
import com.makrol.teamcity.data.models.TestTeamCityProject
import com.makrol.teamcity.utilities.configuration.TestRepo
import com.makrol.teamcity.utilities.helpers.appendRandomNumericPostfix
import java.net.URL

class ProjectsApiWrapper : BaseApiClient() {
    private val gitVcsName = "jetbrains.git"

    private val projectApi: ProjectApi = ProjectApi(baseClient)
    private val buildTypeApi: BuildTypeApi = BuildTypeApi(baseClient)
    private val vcsRootApi: VcsRootApi = VcsRootApi(baseClient)

    fun createSimpleTeamCityProject(repoData: TestRepo): TestTeamCityProject {
        val createdProject: Project = createProject()
        val createdRoot: VcsRoot =
            createVcsRoot(repoData.url, repoData.user, repoData.password, repoData.mainBranch, createdProject.id)
        val createdBuildType: BuildType = createBuildType(createdProject, createdRoot)
        return TestTeamCityProject(createdProject, createdBuildType, createdRoot)
    }

    fun deleteProject(project: TestTeamCityProject) {
        deleteBuildType(project.buildTypeId)
        deleteVcsRoot(project.vcsRootId)
        deleteProject(project.projectId)
    }

    private fun createProject(): Project {
        val newProject = NewProjectDescription()
        newProject.name("simple_tc_project".appendRandomNumericPostfix())

        return projectApi.addProject(newProject)
    }

    private fun createVcsRoot(
        repoUrl: URL,
        repoUser: String,
        repoPassword: String,
        branch: String,
        projectId: String
    ): VcsRoot {
        val rootId: String = "vcsRoot".appendRandomNumericPostfix()

        val newRoot = VcsRoot()
        newRoot.id = rootId
        newRoot.name = rootId
        newRoot.projectLocator = "id:$projectId"
        newRoot.vcsName = gitVcsName
        newRoot.properties = Properties()
        newRoot.properties.addProperty(
            Pair("agentCleanFilesPolicy", "ALL_UNTRACKED"),
            Pair("agentCleanPolicy", "ON_BRANCH_CHANGE"),
            Pair("branch", branch),
            Pair("teamcity:branchSpec", "+:*"),
            Pair("url", repoUrl.toString()),
            Pair("usernameStyle", "USERID"),
            Pair("user", repoUser),
            Pair("password", repoPassword)
        )
        return vcsRootApi.addVcsRoot(newRoot, null)
    }

    private fun createBuildType(createdProject: Project, createdRoot: VcsRoot): BuildType {
        val typeId = "builtType".appendRandomNumericPostfix()
        val newBuildType = BuildType()
        newBuildType.id = typeId
        newBuildType.name = typeId
        newBuildType.project = createdProject
        newBuildType.steps = createStepsWithGradle()
        newBuildType.triggers = createVcsTrigger()
        val vcsRootEntry = VcsRootEntry()
        vcsRootEntry.vcsRoot = createdRoot
        val vcsRootEntries = VcsRootEntries()
        vcsRootEntries.addVcsRootEntryItem(vcsRootEntry)
        newBuildType.vcsRootEntries = vcsRootEntries

        return buildTypeApi.createBuildType(newBuildType, "")
    }

    private fun createStepsWithGradle(): Steps {
        val runnerType = "gradle-runner"
        val gradleStep = Step()
        gradleStep.id = "step_1"
        gradleStep.type = runnerType
        gradleStep.properties = Properties()
        gradleStep.properties.addProperty(
            Pair("teamcity.step.mode", "default"),
            Pair("ui.gradleRunner.gradle.tasks.names", "clean build"),
            Pair("ui.gradleRunner.gradle.wrapper.path", ""),
            Pair("ui.gradleRunner.gradle.wrapper.useWrapper", "true")
        )

        val steps = Steps()
        steps.addStepItem(gradleStep)

        return steps
    }

    private fun createVcsTrigger(): Triggers {
        val trigger = Trigger()
        trigger.id("tr1")
        trigger.type = "vcsTrigger"

        val triggers = Triggers()
        triggers.addTriggerItem(trigger)

        return triggers
    }

    private fun deleteProject(projectId: String) {
        projectApi.deleteProject(projectId)
    }

    private fun deleteBuildType(buildTypeId: String) {
        buildTypeApi.deleteBuildType(buildTypeId)
    }

    private fun deleteVcsRoot(rootId: String) {
        vcsRootApi.deleteVcsRoot(rootId)
    }

    private fun Properties.addProperty(vararg pairs: Pair<String, String>) {
        for (pair in pairs) {
            val newProperty = Property()
            newProperty.name = pair.first
            newProperty.value = pair.second

            this.addPropertyItem(newProperty)
        }
    }
}