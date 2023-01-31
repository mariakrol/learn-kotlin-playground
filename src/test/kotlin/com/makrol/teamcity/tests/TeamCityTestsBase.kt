package com.makrol.teamcity.tests

import com.makrol.teamcity.api.wrapper.UserApiWrapper
import com.makrol.teamcity.data.models.TestUser
import org.assertj.core.api.SoftAssertions
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(SoftAssertionsExtension::class)
abstract class TeamCityTestsBase {
    @InjectSoftAssertions
    protected lateinit var assertions: SoftAssertions

    protected lateinit var userToBeLoggedIn: TestUser

    protected var userApi: UserApiWrapper = UserApiWrapper()

    @AfterEach
    fun deleteUser() {
        userApi.deleteUser(userToBeLoggedIn)
    }
}