package com.makrol.teamcity.utilities.localization

import com.makrol.teamcity.ui.annotations.LocalizedElement

interface LocalizedItem {
    fun getLocalization(): LocalizedElement
}