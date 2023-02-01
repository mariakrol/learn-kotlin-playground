package com.makrol.teamcity.ui.teamcity.page.objects

import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.common.Page
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import com.makrol.teamcity.utilities.helpers.changePath
import java.net.URL
import kotlin.reflect.KAnnotatedElement

abstract class TeamCityPage : Page() {
    fun getExpectedUrl(): URL {
        return getTeamCityPageUrl(this::class)
    }

    companion object {
        inline fun <reified TTeamCityPage : TeamCityPage> open(): TTeamCityPage {
            return open(getTeamCityPageUrl<TTeamCityPage>())
        }

        inline fun <reified TTeamCityPage : TeamCityPage> getTeamCityPageUrl(): URL {
            return getTeamCityPageUrl(TTeamCityPage::class)
        }

        fun getTeamCityPageUrl(pageClass: KAnnotatedElement): URL {
            val urlAnnotation = pageClass.annotations
                .filterIsInstance<PageUrlPath>()
                .firstOrNull()

            var pageUrl = ConfigurationProvider.teamCity.host
            if (urlAnnotation != null) {
                pageUrl = pageUrl.changePath(urlAnnotation.path)
            }

            return pageUrl
        }
    }
}