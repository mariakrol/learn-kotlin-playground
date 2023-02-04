package com.makrol.teamcity.api.wrapper

import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import okhttp3.OkHttpClient

open class BaseApiClient {
    companion object {
        val host = ConfigurationProvider.teamCity.host.toString()
        val baseClient: OkHttpClient = getApiClient(AuthorizationInterceptor())

        private fun getApiClient(authorizationInterceptor: AuthorizationInterceptor): OkHttpClient {
            return OkHttpClient.Builder()
                .addInterceptor(authorizationInterceptor)
                .build()
        }
    }
}

