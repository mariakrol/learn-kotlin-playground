package com.makrol.teamcity.data.models

import com.makrol.teamcity.api.swagger.client.model.User

class TestUser(val user: User, var password: String, val isAdmin: Boolean) {

    val userName: String = user.username ?: ""
    val name: String = user.name ?: ""
    private val email: String = user.email ?: ""

    fun toProfileInfo(): ProfileInfo {
        return ProfileInfo(userName, name, email)
    }

    override fun toString(): String {
        return "User with credentials: $userName/$password"
    }
}