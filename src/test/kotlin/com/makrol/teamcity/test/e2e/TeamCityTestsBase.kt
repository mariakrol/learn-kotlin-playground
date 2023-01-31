package com.makrol.teamcity.test.e2e

import org.assertj.core.api.SoftAssertions
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(SoftAssertionsExtension::class)
abstract class TeamCityTestsBase {
    @InjectSoftAssertions
    protected lateinit var softly: SoftAssertions
}