package com.makrol.teamcity.utilities.helpers.selenide

import com.codeborne.selenide.WebDriverRunner
import com.makrol.teamcity.utilities.helpers.toUrl
import java.net.URL

fun getCurrentUrl(): URL {
    return WebDriverRunner.getWebDriver().currentUrl.toUrl()
}