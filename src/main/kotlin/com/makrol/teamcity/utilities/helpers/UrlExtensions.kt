package com.makrol.teamcity.utilities.helpers

import java.net.URL

fun String.toUrl(): URL {
    return URL(this)
}

fun URL.changePath(path: String): URL {
    return URL(this, path)
}