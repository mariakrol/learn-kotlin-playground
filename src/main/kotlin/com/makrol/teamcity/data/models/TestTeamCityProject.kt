package com.makrol.teamcity.data.models

import com.makrol.teamcity.api.swagger.client.model.*

class TestTeamCityProject constructor(val project: Project, val buildType: BuildType, val vcsRoot: VcsMinusRoot) {
    val projectName: String = project.name!!
    val projectId: String = project.id!!
    val buildTypeName: String = buildType.name!!
    val buildTypeId: String = buildType.id!!
    val vcsRootId: String = vcsRoot.id!!
}