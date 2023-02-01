package com.makrol.teamcity.user.scenario.flow.email

import com.icegreen.greenmail.junit5.GreenMailExtension
import com.makrol.teamcity.user.scenario.flow.UserScenarioFlow
import io.qameta.allure.Step
import jakarta.mail.internet.MimeMessage
import org.assertj.core.api.SoftAssertions

class MailboxFlow private constructor(
    assertions: SoftAssertions,
    private val greenMail: GreenMailExtension
) : UserScenarioFlow(assertions) {

    //ToDo: filter by subject
    @Step("Get the latest email from user's mailbox")
    fun findLatestEmail(recipient: String): EmailFlow {
        return EmailFlow(assertions, getLatestEmail(recipient))
    }

    private fun getLatestEmail(recipient: String): MimeMessage {
        var attempts = 5
        while (attempts > 0) {
            attempts--
            val emailCount = 1
            val isEmailReceived = greenMail.waitForIncomingEmail(emailCount)
            if (isEmailReceived) {
                val message = greenMail.receivedMessages
                    .firstOrNull { it.allRecipients.any { a -> a.toString() == recipient } }
                if (message != null) {
                    return message
                }
            }
        }
        throw RuntimeException("Cannot find email sent to $recipient")
    }

    companion object {
        fun start(assertions: SoftAssertions, smtpServer: GreenMailExtension): MailboxFlow {
            return MailboxFlow(assertions, smtpServer)
        }
    }
}