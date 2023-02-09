package com.makrol.teamcity.tests.e2e

import com.icegreen.greenmail.junit5.GreenMailExtension
import com.icegreen.greenmail.util.ServerSetupTest
import com.makrol.teamcity.tests.TeamCityTestsBase
import com.makrol.teamcity.user.scenario.flow.ui.AnonymousTeamCityFlow
import com.makrol.teamcity.user.scenario.flow.email.MailboxFlow
import com.makrol.teamcity.utilities.GreenMailService
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import io.qameta.allure.Feature
import io.qameta.allure.Owner
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.RegisterExtension
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@Owner("makrol")
@DisplayName("Registered user can reset password")
class ResetPasswordTests : TeamCityTestsBase() {
    //ToDo: Localization?
    private val resetPasswordMailSubject = "Reset your TeamCity password"

    private val successfulResetLabel = "Your password has been reset."

    private var teamCityUrl = ConfigurationProvider.teamCity.host

    @JvmField
    @RegisterExtension //ToDo: Try to wrap greenMail to be able to change tool
    var greenMail = GreenMailExtension(ServerSetupTest.SMTP)

    @Feature("ResetPassword")
    @Feature("Login")
    @DisplayName("by following reset link in email regardless admin rights")
    @ParameterizedTest(name = "{index} => is admin rights = {0}")
    @ValueSource(booleans = [true, false])
    fun registeredUserShouldBeAbleToResetPassword(isAdmin: Boolean) {
        userToBeLoggedIn = userApi.createUser(isAdmin, isEmailSet = true)

        val uiTestFlow = AnonymousTeamCityFlow
            .start(assertions)
            .goToPasswordReset()
            .initiatePasswordReset(userToBeLoggedIn)
        val resetPasswordUrl = MailboxFlow
            .start(assertions, GreenMailService(greenMail))
            .findLatestEmail(userToBeLoggedIn.email, resetPasswordMailSubject)
            .validateSubject(resetPasswordMailSubject)
            .getLinkFromBody(teamCityUrl)
        uiTestFlow
            .completeReset(userToBeLoggedIn, resetPasswordUrl!!)
            .validateSuccessMessage(successfulResetLabel)
            .validateUserInfo()
    }
}