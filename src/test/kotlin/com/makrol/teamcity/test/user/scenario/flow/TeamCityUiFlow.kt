package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.ui.common.Page
import mu.KotlinLogging

abstract class TeamCityUiFlow(protected val currentPage: Page) {
    protected val logger = KotlinLogging.logger { }
}