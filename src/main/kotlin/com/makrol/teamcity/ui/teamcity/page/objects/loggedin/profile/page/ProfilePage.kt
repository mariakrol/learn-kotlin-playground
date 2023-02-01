package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page

import com.codeborne.selenide.Selectors.byTagName
import com.codeborne.selenide.Selenide.element
import com.makrol.teamcity.data.models.ProfileInfo
import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.AvailableByUserMenu
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.LoggedInPage
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.GeneralSettingsSection
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.ProfilePageSection
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.ProfileSideBar
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements.ProfileSideBarItem

@PageUrlPath("/profile.html")
class ProfilePage : LoggedInPage(), AvailableByUserMenu {
    fun getProfileInfo(): ProfileInfo {
        openPageSection(ProfileSideBarItem.General)
        val generalSection = mainSection as GeneralSettingsSection

        return ProfileInfo(generalSection.getUserName(), generalSection.getName(), generalSection.getEmail())
    }

    fun getSuccessMessage(): String? {
        return mainSection.getSuccessMessage()
    }

    private fun openPageSection(section: ProfileSideBarItem) {
        sideBar.clickOnItem(section)
        mainSection = section.createSection()
    }

    @ImplicitCheck(isVisible = true)
    private val headerLabel = element(byTagName("h1"))

    @ImplicitCheck(isVisible = true)
    private val sideBar = ProfileSideBar()

    @ImplicitCheck(isVisible = true)
    private var mainSection: ProfilePageSection = GeneralSettingsSection()
}