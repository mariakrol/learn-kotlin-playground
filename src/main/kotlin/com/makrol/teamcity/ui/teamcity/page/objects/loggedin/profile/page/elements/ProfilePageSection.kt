package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements

import com.codeborne.selenide.Selectors
import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selenide.element
import com.makrol.teamcity.ui.common.ComplexUiElement

abstract class ProfilePageSection : ComplexUiElement(Selectors.byId("main-content-tag")) {
    fun getSuccessMessage(): String? {
        if (successMessageLabel.isDisplayed) {
            return successMessageLabel.text
        }

        return null
    }

    private val successMessageLabel = element(byCssSelector(".successMessage[style*='block']"))
}