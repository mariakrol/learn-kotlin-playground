package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.ui.common.Page
import mu.KotlinLogging

abstract class TeamCityUiFlow(protected var currentPage: Page) {
    constructor(previousFlow: TeamCityUiFlow) : this(previousFlow.currentPage)

    protected val logger = KotlinLogging.logger { }
}