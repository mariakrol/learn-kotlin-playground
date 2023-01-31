package com.makrol.teamcity.utilities.helpers.selenide

import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.ui.common.UiElementContainer
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import com.makrol.teamcity.utilities.localization.TextDomAttribute
import org.openqa.selenium.By
import kotlin.reflect.KAnnotatedElement

fun UiElementContainer.createElementByLocalizedText(
    selfAnnotationSource: KAnnotatedElement, xPathPattern: String = ""
): SelenideElement {
    val localizationInfo = selfAnnotationSource.annotations
        .filterIsInstance<LocalizedElement>()
        .first { it.lang == ConfigurationProvider.teamCity.language }
    val locator = getLocator(localizationInfo, xPathPattern)

    if (this is ComplexUiElement) {
        return this.innerElement.find(locator)
    }

    return element(locator)
}

private fun getLocator(localizationInfo: LocalizedElement, xPathPattern: String = ""): By {
    if (xPathPattern.isNotEmpty()) {
        return byXpath(String.format(xPathPattern, localizationInfo.text))
    }

    return when (localizationInfo.domAttribute) {
        TextDomAttribute.Text -> byText(localizationInfo.text)
        TextDomAttribute.Value -> byValue(localizationInfo.text)
        TextDomAttribute.Title -> byAttribute("title", localizationInfo.text)
    }
}