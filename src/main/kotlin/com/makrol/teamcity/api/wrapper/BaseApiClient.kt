package com.makrol.teamcity.api.wrapper

import com.makrol.teamcity.api.swagger.client.ApiClient
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider

open class BaseApiClient {
    protected val baseClient: ApiClient = ApiClient()

    init {
        baseClient.basePath = ConfigurationProvider.teamCity.host.toString()
        baseClient.addDefaultHeader("Content-Type", "application/xml")
        baseClient.addDefaultHeader("Authorization", "Bearer " + ConfigurationProvider.teamCity.token)
    }
}

