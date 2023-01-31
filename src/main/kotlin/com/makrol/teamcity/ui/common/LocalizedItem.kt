package com.makrol.teamcity.ui.common

import com.makrol.teamcity.ui.annotations.LocalizedElement

interface LocalizedItem {
    fun getLocalization(): LocalizedElement
}