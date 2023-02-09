package com.makrol.teamcity.user.scenario.flow.email

import com.makrol.teamcity.user.scenario.flow.UserScenarioFlow
import com.makrol.teamcity.utilities.SmtpServiceWrapper
import io.qameta.allure.Step
import org.assertj.core.api.SoftAssertions

class MailboxFlow private constructor(
    assertions: SoftAssertions,
    private val smtpService: SmtpServiceWrapper
) : UserScenarioFlow(assertions) {
    @Step("Get the latest email from user's mailbox")
    fun findLatestEmail(recipient: String, subject: String): EmailFlow {
        val targetEmail = smtpService.getEmail(recipient, subject)

        return EmailFlow(assertions, targetEmail)
    }

    companion object {
        fun start(assertions: SoftAssertions, smtpServer: SmtpServiceWrapper): MailboxFlow {
            return MailboxFlow(assertions, smtpServer)
        }
    }
}