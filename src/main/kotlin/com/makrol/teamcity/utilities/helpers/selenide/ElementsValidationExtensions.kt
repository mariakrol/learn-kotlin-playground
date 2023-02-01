package com.makrol.teamcity.utilities.helpers.selenide

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.ui.common.ComplexUiElement
import com.makrol.teamcity.ui.common.UiElementContainer
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import com.makrol.teamcity.utilities.helpers.getAnnotatedProperties
import com.makrol.teamcity.utilities.helpers.getPropertyValue
import com.makrol.teamcity.utilities.localization.TextDomAttribute
import mu.KotlinLogging
import kotlin.reflect.KProperty1
import kotlin.reflect.full.superclasses

private val logger = KotlinLogging.logger { }

fun UiElementContainer.validateElementsVisibility() {
    validateVisibility(this)
}

fun UiElementContainer.validateTextElements() {
    validateTextElements(this)
}

private fun validateVisibility(container: Any) {
    logger.debug("Check visibility of annotated elements placed in ${container::class.simpleName}")
    val elementContainerClass = container::class
    val typeHierarchy = elementContainerClass.superclasses.toList() + elementContainerClass

    for (type in typeHierarchy) {
        for (property in type.getAnnotatedProperties<SelenideElement, ImplicitCheck>()) {
            checkElementVisibility<SelenideElement>(property, container)
        }

        for (property in type.getAnnotatedProperties<ComplexUiElement, ImplicitCheck>()) {
            checkElementVisibility<ComplexUiElement>(property, container)

            val isVisible = property.annotations
                .filterIsInstance<ImplicitCheck>()
                .first().isVisible
            if (isVisible) {
                validateVisibility(property.getPropertyValue<ComplexUiElement>(container))
            }
        }
    }
}

private fun validateTextElements(container: Any) {
    logger.debug("Check inner text of annotated elements placed in ${container::class.simpleName}")

    val elementContainerClass = container::class
    val typeHierarchy = elementContainerClass.superclasses.toList() + elementContainerClass

    for (type in typeHierarchy) {
        for (property in type.getAnnotatedProperties<SelenideElement, ImplicitCheck>()
            .filter { it.annotations.filterIsInstance<LocalizedElement>().any() }) {

            checkElementText(property, container)
        }

        for (property in type.getAnnotatedProperties<ComplexUiElement, ImplicitCheck>()
            .filter { it.annotations.filterIsInstance<ImplicitCheck>().first().isVisible }) {

            validateTextElements(property.getPropertyValue<ComplexUiElement>(container))
        }
    }

}

private fun getTextAssertionCondition(domAttribute: TextDomAttribute, expectedText: String) = when (domAttribute) {
    TextDomAttribute.Value -> Condition.value(expectedText)
    TextDomAttribute.Text -> Condition.text(expectedText)
    TextDomAttribute.Title -> Condition.attribute("title", expectedText)
}

private inline fun <reified TElement> checkElementVisibility(property: KProperty1<out Any, *>, container: Any) {
    val element = property.getPropertyValue<TElement>(container)!!
    val isVisible = property.annotations
        .filterIsInstance<ImplicitCheck>()
        .first().isVisible

    logger.debug("Check element ${property.name} visibility == $isVisible")
    element.asSelenideElement().assertVisibility(isVisible)
}

private fun checkElementText(property: KProperty1<out Any, *>, container: Any) {
    val isVisible = property.annotations
        .filterIsInstance<ImplicitCheck>()
        .first().isVisible

    if (isVisible) {
        val textElement = property.getPropertyValue<SelenideElement>(container)
        val localizationInfo = property.annotations
            .filterIsInstance<LocalizedElement>()
            .first { a -> a.lang == ConfigurationProvider.teamCity.language }

        logger.debug("Check element ${property.name} localized attribute ${localizationInfo.domAttribute} == ${localizationInfo.text}")
        textElement.should(getTextAssertionCondition(localizationInfo.domAttribute, localizationInfo.text))
    }
}

private fun Any.asSelenideElement(): SelenideElement {
    if (this is SelenideElement) {
        return this
    }
    if (this is ComplexUiElement) {
        return this.innerElement
    }

    throw IllegalArgumentException("Cannot convert object $this of type ${this::class} to SelenideElement")
}