package com.makrol.teamcity.utilities.configuration

import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addResourceSource
import com.sksamuel.hoplite.json.JsonParser

class ConfigurationProvider {
    companion object {
        private val config: Config by lazy {
            ConfigLoaderBuilder.default()
                .addParser("json", JsonParser())
                .addResourceSource("/run-settings.json")
                .build()
                .loadConfigOrThrow()
        }

        val teamCity = config.teamCityInstance

        val testRepo = config.testRepo
    }
}