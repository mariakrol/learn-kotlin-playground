package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements

import com.codeborne.selenide.Selectors.byCssSelector
import com.codeborne.selenide.Selenide.element
import com.makrol.teamcity.ui.common.SideBar

class ProfileSideBar :
    SideBar<ProfileSideBarItem>(ProfileSideBarItem::class.java, byCssSelector("aside"), byCssSelector(".item a")) {
    private fun getSelectedItem(): ProfileSideBarItem {
        val selectedItemText = element(byCssSelector(".item.active a")).text
        return ProfileSideBarItem.getItemByLocalizedText(selectedItemText)
    }

    override fun clickOnItem(item: ProfileSideBarItem) {
        if (getSelectedItem() != item) {
            super.clickOnItem(item)
        }
    }
}