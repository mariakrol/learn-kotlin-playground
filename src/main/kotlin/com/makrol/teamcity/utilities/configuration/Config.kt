package com.makrol.teamcity.utilities.configuration

import com.makrol.teamcity.utilities.localization.Language
import java.net.URL

data class Config(val teamCityInstance: TeamCityTestInstance)

data class TeamCityTestInstance(val host: URL, val token: String, val language: Language)