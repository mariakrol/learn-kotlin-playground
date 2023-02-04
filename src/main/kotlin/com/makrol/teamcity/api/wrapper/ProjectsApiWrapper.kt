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

    private val projectApi: ProjectApi = ProjectApi(host, baseClient)
    private val buildTypeApi: BuildTypeApi = BuildTypeApi(host, baseClient)
    private val vcsRootApi: VcsRootApi = VcsRootApi(host, baseClient)

    fun createSimpleTeamCityProject(repoData: TestRepo): TestTeamCityProject {
        val createdProject = createProject()
        val createdRoot =
            createVcsRoot(repoData.url, repoData.user, repoData.password, repoData.mainBranch, createdProject.id!!)
        val createdBuildType: BuildType = createBuildType(createdProject, createdRoot)

        return TestTeamCityProject(createdProject, createdBuildType, createdRoot)
    }

    fun deleteProject(project: TestTeamCityProject) {
        deleteBuildType(project.buildTypeId)
        deleteVcsRoot(project.vcsRootId)
        deleteProject(project.projectId)
    }

    private fun createProject(): Project {
        val newProject = NewProjectDescription(name = "simple_tc_project".appendRandomNumericPostfix())

        return projectApi.addProject(newProject)
    }

    private fun createVcsRoot(
        repoUrl: URL,
        repoUser: String,
        repoPassword: String,
        branch: String,
        projectId: String
    ): VcsMinusRoot {
        val rootId: String = "vcsRoot".appendRandomNumericPostfix()

        val newRoot = VcsMinusRoot(
            id = rootId,
            name = rootId,
            projectLocator = "id:$projectId",
            vcsName = gitVcsName,
            properties = Properties(
                property = listOf(
                    Pair("agentCleanFilesPolicy", "ALL_UNTRACKED").toProperty(),
                    Pair("agentCleanPolicy", "ON_BRANCH_CHANGE").toProperty(),
                    Pair("branch", branch).toProperty(),
                    Pair("teamcity:branchSpec", "+:*").toProperty(),
                    Pair("url", repoUrl.toString()).toProperty(),
                    Pair("usernameStyle", "USERID").toProperty(),
                    Pair("authentication", "Anonymous").toProperty()
                )
            )
        )
        return vcsRootApi.addVcsRoot(body = newRoot)
    }

    private fun createBuildType(createdProject: Project, createdRoot: VcsMinusRoot): BuildType {
        val typeId = "builtType".appendRandomNumericPostfix()
        val newBuildType = BuildType(
            id = typeId,
            name = typeId,
            project = createdProject,
            steps = createStepsWithGradle(),
            triggers = createVcsTrigger(),
            vcsRootEntries = VcsMinusRootMinusEntries(vcsRootEntry = listOf(VcsMinusRootMinusEntry(vcsRoot = createdRoot)))
        )

        return buildTypeApi.createBuildType(body = newBuildType)
    }

    private fun createStepsWithGradle(): Steps {
        val properties = Properties(
            property = listOf(
                Pair("teamcity.step.mode", "default").toProperty(),
                Pair("ui.gradleRunner.gradle.tasks.names", "clean build").toProperty(),
                Pair("ui.gradleRunner.gradle.wrapper.path", "").toProperty(),
                Pair("ui.gradleRunner.gradle.wrapper.useWrapper", "true").toProperty()
            )
        )

        val gradleStep = Step(
            id = "step_1",
            type = "gradle-runner",
            properties = properties
        )

        return Steps(step = listOf(gradleStep))
    }

    private fun createVcsTrigger(): Triggers {
        return Triggers(trigger = listOf(Trigger(id = "tr1", type = "vcsTrigger")))
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
}

fun Pair<String, String>.toProperty(): Property {
    return Property(name = this.first, value = this.second)
}