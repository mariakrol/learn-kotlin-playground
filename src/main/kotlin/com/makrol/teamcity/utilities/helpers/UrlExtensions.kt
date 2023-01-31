package com.makrol.teamcity.utilities.helpers

import java.net.URL

fun URL.changePath(path: String): URL {
    return URL(this, path)
}