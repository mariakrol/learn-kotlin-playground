package com.makrol.teamcity.user.scenario.flow

import org.assertj.core.api.SoftAssertions

abstract class UserScenarioFlow constructor(protected val assertions: SoftAssertions) {
    protected constructor(previous: UserScenarioFlow) : this(previous.assertions)
}