package com.makrol.teamcity.user.scenario.flow

import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.ui.common.Page
import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.anonymous.ForgotPasswordPage
import com.makrol.teamcity.ui.teamcity.page.objects.anonymous.ResetPasswordPage
import com.makrol.teamcity.ui.teamcity.page.objects.anonymous.login.page.LoginPage
import com.makrol.teamcity.user.scenario.flow.exceptions.UnexpectedFlowState
import com.makrol.teamcity.utilities.helpers.RandomHelper
import io.qameta.allure.Step
import org.assertj.core.api.SoftAssertions
import java.net.URL

class AnonymousTeamCityFlow private constructor(assertions: SoftAssertions, currentPage: TeamCityPage) :
    TeamCityUiFlow(assertions, currentPage) {
    @Step("Login to TeamCity")
    fun login(user: TestUser): ProjectsSpaceTeamCityFlow {
        logger.info("Login to TeamCity with $user")

        if (currentPage is LoginPage) {
            currentPage = (currentPage as LoginPage).login(user.userName, user.password)
            logger.info("User is logged in")

            return ProjectsSpaceTeamCityFlow(this, user)
        } else {
            throw UnexpectedFlowState("Expected, that current open page is Login, but found ${currentPage::class}")
        }
    }

    @Step("Validate elements on currently open page")
    override fun validateCurrentPage(): AnonymousTeamCityFlow {
        logger.info("Check elements visibility for page: ${currentPage::class.simpleName}")
        validatePage()

        return this
    }

    @Step("Open Reset Password page")
    fun goToPasswordReset(): AnonymousTeamCityFlow {
        logger.info("Go to Forgot Password page")
        if (currentPage is LoginPage) {
            currentPage = (currentPage as LoginPage).resetPassword()
            logger.info("User is logged in")

            return this
        } else {
            throw UnexpectedFlowState("Expected, that current open page is Login, but found ${currentPage::class}")
        }
    }

    @Step("Initiate password reset for the user")
    fun initiatePasswordReset(user: TestUser): AnonymousTeamCityFlow {
        logger.info("Initiate reset process")
        if (currentPage is ForgotPasswordPage) {
            (currentPage as ForgotPasswordPage).resetPassword(user.email)

            return this
        } else {
            throw UnexpectedFlowState("Expected, that current open page is Forgot Password page, but found ${currentPage::class}")
        }
    }

    @Step("Complete reset by open of link from email")
    fun completeReset(user: TestUser, resetLink: URL): ProfileSpaceTeamCityFlow {
        logger.info("Go to Reset Password page by using link from email")
        val resetPasswordPage = Page.open<ResetPasswordPage>(resetLink)
        val newPassword = RandomHelper.getRandomString()

        logger.info("Set new password and finish reset")
        currentPage = resetPasswordPage.resetPassword(newPassword)
        user.password = newPassword

        return ProfileSpaceTeamCityFlow(this, user)
    }

    companion object {
        fun start(assertions: SoftAssertions): AnonymousTeamCityFlow {
            val loginPage = TeamCityPage.open<LoginPage>()

            return AnonymousTeamCityFlow(assertions, loginPage)
        }
    }
}

