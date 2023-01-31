package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.elements.user.menu

import com.makrol.teamcity.ui.annotations.LocalizedElement
import com.makrol.teamcity.utilities.localization.LocalizedItem
import com.makrol.teamcity.utilities.configuration.ConfigurationProvider
import com.makrol.teamcity.utilities.localization.Language
import com.makrol.teamcity.utilities.localization.TextDomAttribute

enum class UserMenuItem : LocalizedItem {
    @LocalizedElement(Language.En, TextDomAttribute.Text, "Profile")
    Profile,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Favorite Builds")
    FavoriteBuilds,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Investigations")
    Investigations,

    @LocalizedElement(Language.En, TextDomAttribute.Text, "Logout")
    Logout;

    //ToDo: To extension method?
    override fun getLocalization(): LocalizedElement {
        return this.declaringJavaClass.getField(this.name).annotations
            .filterIsInstance<LocalizedElement>()
            .first { l -> l.lang == ConfigurationProvider.teamCity.language }
    }
}