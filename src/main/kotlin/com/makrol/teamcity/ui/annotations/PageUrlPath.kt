package com.makrol.teamcity.ui.annotations

@Target(AnnotationTarget.CLASS)
annotation class PageUrlPath constructor(val path: String)