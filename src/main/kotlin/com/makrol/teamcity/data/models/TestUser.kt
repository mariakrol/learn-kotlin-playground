package com.makrol.teamcity.data.models

class TestUser(val userName: String, val name: String, var password: String, val isAdmin: Boolean) {

    override fun toString(): String {
        return "User with credentials: $userName/$password"
    }
}