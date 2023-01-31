package com.makrol.teamcity.utilities.configuration

import java.net.URL

data class Config(val teamCityInstance: TeamCityTestInstance)

data class TeamCityTestInstance(val host: URL, val token: String)