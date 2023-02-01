package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.elements

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selectors.byTagName
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.ex.UIAssertionError
import com.makrol.teamcity.data.models.BuildInformation
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.utilities.helpers.selenide.getAriaExpandedAttribute
import kotlin.time.Duration

class BuildContainer(rawElement: SelenideElement) : ComplexUiElement(rawElement) {
    fun getName(): String {
        return buildNameLabel.text()
    }

    fun getRunInfo(): BuildInformation? {
        expandIfNot()
        val buildInfoElement = getBuildInformationElement()
        try {
            buildInfoElement.checkExists()
        } catch (e: UIAssertionError) {
            return null
        }

        return buildInfoElement.getInformation()
    }

    fun run() {
        runBuildButton.click()
    }

    fun waitFinish(expectedDurationSec: Duration) {
        expandIfNot()

        getBuildInformationElement()
            .waitFinish(expectedDurationSec)
    }

    private fun expandIfNot() {
        if (!detailsButton.getAriaExpandedAttribute()) {
            expandArrow.click()
        }
    }

    @ImplicitCheck(isVisible = true)
    private val detailsButton = getChild(byCssSelector(".Details__asideButton--GB")) //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val expandArrow = getChild(byCssSelector(".BuildTypeLine__chevron--On")) //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val buildNameLabel = getChild(byTagName("h2"))

    private val runBuildButton = getChild(byCssSelector("[data-test='run-build']"))

    private fun getBuildInformationElement(): BuildInformationElement {
        return BuildInformationElement(getChild(byCssSelector(".BuildDetails__buildContainer--Ez"))) //ToDo: change locator
    }
}