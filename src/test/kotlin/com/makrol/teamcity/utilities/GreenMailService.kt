package com.makrol.teamcity.utilities

import com.icegreen.greenmail.junit5.GreenMailExtension
import com.icegreen.greenmail.util.ServerSetupTest
import jakarta.mail.internet.MimeMessage
import org.junit.jupiter.api.extension.*

class GreenMailService : BeforeAllCallback, AfterAllCallback,
    BeforeEachCallback, AfterEachCallback, SmtpServiceWrapper {

    private val greenMail = GreenMailExtension(ServerSetupTest.SMTP)

    override fun getEmail(recipient: String, subject: String): MimeMessage {
        var attempts = 5
        while (attempts > 0) {
            attempts--
            val emailCount = 1
            val isEmailReceived = greenMail.waitForIncomingEmail(emailCount)
            if (isEmailReceived) {
                val message = greenMail.receivedMessages
                    .filter { it.allRecipients.any { a -> a.toString() == recipient } }
                    .firstOrNull { it.subject.equals(subject) }
                if (message != null) {
                    return message
                }
            }
        }
        throw RuntimeException("Cannot find email sent to $recipient")
    }

    override fun beforeAll(context: ExtensionContext?) {
        greenMail.beforeAll(context)
    }

    override fun afterAll(context: ExtensionContext?) {
        greenMail.afterAll(context)
    }

    override fun beforeEach(context: ExtensionContext?) {
        greenMail.beforeEach(context)
    }

    override fun afterEach(context: ExtensionContext?) {
        greenMail.afterEach(context)
    }
}