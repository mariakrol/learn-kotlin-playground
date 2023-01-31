package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.profile.page.elements

import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.LocalizedItem
import com.makrol.teamcity.utilities.localization.TextDomAttribute

enum class ProfileSideBarItem : LocalizedItem {
    @LocalizedElement(Language.En, TextDomAttribute.Text, "General")
    General {
        override fun createSection(): ProfilePageSection {
            return GeneralSettingsSection()
        }
    },

    @LocalizedElement(Language.En, TextDomAttribute.Text, "VCS Usernames")
    VcsUsernames,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Groups")
    Groups,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Notification Rules")
    NotificationRules,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Access Tokens")
    AccessTokens,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Two-Factor Authentication")
    TwoFactorAuth;

    //ToDo: move to extensions
    override fun getLocalization(): LocalizedElement {
        return this.declaringJavaClass.getField(this.name).annotations
            .filterIsInstance<LocalizedElement>()
            .first { it.lang == ConfigurationProvider.teamCity.language }
    }

    open fun createSection(): ProfilePageSection {
        TODO("Not yet implemented")
    }

    companion object {
        fun getItemByLocalizedText(text: String): ProfileSideBarItem {
            return ProfileSideBarItem.values()
                .first { it.getLocalization().text == text }
        }
    }
}