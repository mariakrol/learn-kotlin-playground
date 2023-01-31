package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements

import com.codeborne.selenide.Selenide
import com.makrol.teamcity.ui.common.SideBar
import org.openqa.selenium.By

class ProfileSideBar :
    SideBar<ProfileSideBarItem>(ProfileSideBarItem::class.java, By.tagName("aside"), By.cssSelector(".item a")) {
    private fun getSelectedItem(): ProfileSideBarItem {
        val selectedItemText = Selenide.element(By.cssSelector(".item.active a")).text
        return ProfileSideBarItem.getItemByLocalizedText(selectedItemText)
    }

    override fun clickOnItem(item: ProfileSideBarItem) {
        if (getSelectedItem() != item) {
            super.clickOnItem(item)
        }
    }
}