package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page

import com.codeborne.selenide.Selectors.byTagName
import com.codeborne.selenide.Selenide
import com.makrol.teamcity.data.models.ProfileInfo
import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.AvailableByUserMenu
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.LoggedInPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.GeneralSettingsSection
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.ProfilePageSection
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.ProfileSideBar
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.ProfileSideBarItem

@PageUrlPath("/profile.html")
class ProfilePage : LoggedInPage(), AvailableByUserMenu {
    private val headerLabel = Selenide.element(byTagName("h1"))

    private val sideBar = ProfileSideBar()

    private var mainSection: ProfilePageSection = GeneralSettingsSection()

    fun getProfileInfo(): ProfileInfo {
        openPageSection(ProfileSideBarItem.General)
        val generalSection = mainSection as GeneralSettingsSection

        return ProfileInfo(generalSection.getUserName(), generalSection.getName(), generalSection.getEmail())
    }

    private fun openPageSection(section: ProfileSideBarItem) {
        sideBar.clickOnItem(section)
        mainSection = section.createSection()
    }
}