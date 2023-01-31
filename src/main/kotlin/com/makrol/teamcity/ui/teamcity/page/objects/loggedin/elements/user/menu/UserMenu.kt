package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu

import com.codeborne.selenide.Selectors.byCssSelector
import com.makrol.teamcity.ui.common.Menu

class UserMenu : Menu<UserMenuItem>(UserMenuItem::class.java, expanderItemLocator, itemsLocator) {
    companion object {
        val expanderItemLocator = byCssSelector("[data-hint-container-id='header-user-menu'] button")
        val itemsLocator = byCssSelector("[data-test='ring-popup'] [data-test*='ring-list-item']")
    }

    fun getTitle(): String? {
        return menuExpander.getDomAttribute("title")
    }
}