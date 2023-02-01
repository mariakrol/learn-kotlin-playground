package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page.elements

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.data.models.BuildInformation
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.common.ComplexUiElement
import kotlin.time.Duration
import kotlin.time.toJavaDuration

class BuildInformationElement(rawElement: SelenideElement) : ComplexUiElement(rawElement) {
    private val greenStatusAttribute = "finished_green"

    fun waitFinish(expectedDuration: Duration) {
        durationLabel
            .should(Condition.visible, expectedDuration.toJavaDuration())
        stopBuildButton
            .shouldNot(Condition.exist)
    }

    fun getInformation(): BuildInformation {
        val number: Int = buildNumberLink.text().trimStart('#').toInt()
        val branch = branchNameLink.text()
        val durationSec = durationLabel.text().trimEnd('s').toLong() //ToDo: parse time from page and compare
        val isSucceeded = buildStatusLink.getAttribute("data-test-link-with-icon") == greenStatusAttribute

        return BuildInformation(number, branch, durationSec, isSucceeded)
    }

    @ImplicitCheck(isVisible = true)
    private val buildNumberLink = getChild(byCssSelector(".BuildNumber__link--of")) //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val branchNameLink = getChild(byCssSelector(".BranchLabel__main--RY")) //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val durationLabel =
        getChild(byCssSelector(".BuildDurationAnchor__durationFinished--ef")) //ToDo: change locator

    @ImplicitCheck(isVisible = true)
    private val buildStatusLink = getChild(byCssSelector(".Build__status--bG a")) //ToDo: change locator

    private val stopBuildButton = getChild(byCssSelector(".StopBuild__stopBuild--PY")) //ToDo: change locator
}