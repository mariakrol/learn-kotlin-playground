package com.makrol.teamcity.utilities.helpers

import java.net.URL
import java.util.regex.Pattern
import kotlin.math.abs
import kotlin.random.Random

fun String.appendRandomNumericPostfix(separator: String = "_"): String {
    return "${this}${separator}${abs(Random.nextInt())}"
}

fun String.extractLinkToHost(host: URL): URL? {
    val hostText = host.toString()
    val urlPattern = Pattern.compile("(?:$hostText/)[\\w/\\-?:=%.]+")
    val matcher = urlPattern.matcher(this)
    return if (matcher.find()) {
        matcher.group(0).toUrl()
    } else null
}