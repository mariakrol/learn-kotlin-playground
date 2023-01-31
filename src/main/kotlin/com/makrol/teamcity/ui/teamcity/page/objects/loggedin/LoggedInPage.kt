package com.makrol.teamcity.ui.teamcity.page.objects.loggedin

import com.makrol.teamcity.ui.teamcity.page.objects.TeamCityPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.Header
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu.UserMenuItem

abstract class LoggedInPage : TeamCityPage() {
    inline fun <reified TSettingsPage> openPageByUserMenu(item: UserMenuItem): TSettingsPage
            where TSettingsPage : LoggedInPage, TSettingsPage : AvailableByUserMenu {

        return open { header.getUserMenu().clickOnItem(item) }
    }

    val header = Header()
}