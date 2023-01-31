package com.makrol.teamcity.ui.annotations

import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute


@Target(AnnotationTarget.PROPERTY, AnnotationTarget.CLASS)
@Repeatable
annotation class LocalizedElement(val lang: Language, val domAttribute: TextDomAttribute, val text: String)
