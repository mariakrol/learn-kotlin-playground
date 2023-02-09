package com.makrol.teamcity.utilities.configuration

import com.makrol.teamcity.utilities.localization.Language
import java.net.URL

data class Config(val teamCityInstance: TeamCityTestInstance, val testRepo: TestRepo)

data class TeamCityTestInstance(val host: URL, val token: String, val language: Language)

data class TestRepo(val url: URL, val authenticationMode: AuthenticationMode, val user: String? = null, val password: String? = null, val mainBranch: String)