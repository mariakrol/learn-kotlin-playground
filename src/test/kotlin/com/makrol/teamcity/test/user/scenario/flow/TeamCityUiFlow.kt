package com.makrol.teamcity.test.user.scenario.flow

import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import mu.KotlinLogging
import org.assertj.core.api.SoftAssertions

abstract class TeamCityUiFlow(protected val assertions: SoftAssertions, protected var currentPage: TeamCityPage) {
    constructor(previousFlow: TeamCityUiFlow) : this(previousFlow.assertions, previousFlow.currentPage) {
        this.currentPage = previousFlow.currentPage
    }

    protected val logger = KotlinLogging.logger { }
}