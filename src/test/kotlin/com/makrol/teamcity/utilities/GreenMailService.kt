package com.makrol.teamcity.utilities

import com.icegreen.greenmail.junit5.GreenMailExtension
import jakarta.mail.internet.MimeMessage

class GreenMailService(private val greenMail: GreenMailExtension) : SmtpServiceWrapper {
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
}