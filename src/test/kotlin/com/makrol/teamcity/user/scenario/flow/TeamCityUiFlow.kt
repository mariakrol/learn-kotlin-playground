package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.utilities.helpers.selenide.getCurrentUrl
import com.makrol.teamcity.utilities.helpers.selenide.validateElementsVisibility
import com.makrol.teamcity.utilities.helpers.selenide.validateTextElements
import mu.KotlinLogging
import org.assertj.core.api.SoftAssertions
import java.net.URL

abstract class TeamCityUiFlow(protected val assertions: SoftAssertions, protected var currentPage: TeamCityPage) {
    constructor(previousFlow: TeamCityUiFlow) : this(previousFlow.assertions, previousFlow.currentPage) {
        this.currentPage = previousFlow.currentPage
    }

    abstract fun validateCurrentPage(): TeamCityUiFlow

    protected fun validatePage() {
        currentPage.validateElementsVisibility()
        currentPage.validateTextElements()

        assertUrlWithoutQuery()
    }

    protected open fun assertUrlWithoutQuery() {
        val actualUrl: URL = getCurrentUrl()
        val expectedUrl: URL = currentPage.getExpectedUrl()

        assertions.assertThat(actualUrl)
            .describedAs("Url of current page")
            .hasProtocol(expectedUrl.protocol)
            .hasHost(expectedUrl.host)
            .hasPort(expectedUrl.port)
            .hasPath(expectedUrl.path)
    }

    protected val logger = KotlinLogging.logger { }
}