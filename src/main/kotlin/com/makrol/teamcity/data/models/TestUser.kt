package com.makrol.teamcity.data.models

class TestUser(
    val userName: String,
    private val name: String,
    private val email: String,
    var password: String,
    val isAdmin: Boolean
) {
    fun toProfileInfo(): ProfileInfo {
        return ProfileInfo(userName, name, email)
    }

    override fun toString(): String {
        return "User with credentials: $userName/$password"
    }
}