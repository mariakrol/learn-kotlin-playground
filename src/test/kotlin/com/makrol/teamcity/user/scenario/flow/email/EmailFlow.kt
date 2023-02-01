package com.makrol.teamcity.user.scenario.flow.email

import com.makrol.teamcity.user.scenario.flow.UserScenarioFlow
import com.makrol.teamcity.utilities.helpers.extractLinkToHost
import io.qameta.allure.Step
import jakarta.mail.internet.MimeMessage
import jakarta.mail.internet.MimeMultipart
import org.assertj.core.api.SoftAssertions
import java.net.URL

class EmailFlow(assertions: SoftAssertions, private val message: MimeMessage) : UserScenarioFlow(assertions) {
    @Step("Check subject of email")
    fun validateSubject(expectedSubject: String): EmailFlow {
        assertions.assertThat(message.subject)
            .describedAs("subject")
            .isEqualTo(expectedSubject)
        return this
    }

    @Step("Extract link to Reset Password page from th body")
    fun getLinkFromBody(expectedHost: URL): URL? {
        val plainTextBody = getPlainTextBody()
        assertions
            .assertThat(plainTextBody)
            .describedAs("plain text body")
            .contains(expectedHost.toString())

        return plainTextBody.extractLinkToHost(expectedHost)
    }

    private fun getPlainTextBody(): String {
        val multiPartBody = message.content as MimeMultipart
        return buildString {
            for (i in 0 until multiPartBody.count) {
                val bodyPart = multiPartBody.getBodyPart(i)
                if (bodyPart.contentType.contains("plain")) {
                    append(bodyPart.content.toString())
                }
            }
        }
    }
}