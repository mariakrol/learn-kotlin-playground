package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser

class ProjectsSpaceTeamCityFlow : AuthorizedTeamCityFlow {
    constructor(previous: AuthorizedTeamCityFlow) : super(previous)

    constructor(previous: TeamCityUiFlow, user: TestUser) : super(previous, user)
}