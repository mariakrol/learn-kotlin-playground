package com.makrol.teamcity.utilities.helpers

class RandomHelper {
    companion object {
        private val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

        fun getRandomString(length: Int = 5): String {
            return List(length) { charPool.random() }
                .joinToString("")
        }
    }
}