package com.makrol.teamcity.data.models

data class BuildInformation(val number: Int, val branch: String, val durationSec: Long, val isSucceeded: Boolean)