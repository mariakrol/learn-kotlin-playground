package com.makrol.teamcity.ui.common

import com.codeborne.selenide.Selenide
import com.makrol.teamcity.utilities.helpers.constructByParameterlessCtor
import java.net.URL

abstract class Page : UiElementContainer {
    companion object {
        inline fun <reified TPage : Page> open(openAction: () -> Unit): TPage {
            openAction.invoke()
            return constructPage()
        }

        inline fun <reified TPage : Page> open(url: URL): TPage {
            return open { Selenide.open(url) }
        }

        inline fun <reified TPage : Page> constructPage(): TPage {
            return constructByParameterlessCtor()
        }
    }
}