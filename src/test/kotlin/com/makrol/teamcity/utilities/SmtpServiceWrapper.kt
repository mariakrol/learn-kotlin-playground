package com.makrol.teamcity.utilities

import jakarta.mail.internet.MimeMessage

interface SmtpServiceWrapper {
    fun getEmail(recipient: String, subject: String) : MimeMessage
}