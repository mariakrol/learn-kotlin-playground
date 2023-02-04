package com.makrol.teamcity.api.wrapper

import com.makrol.teamcity.api.swagger.client.api.UserApi
import com.makrol.teamcity.api.swagger.client.model.*
import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.utilities.helpers.appendRandomNumericPostfix

class UserApiWrapper: BaseApiClient()  {
    private val defaultPassword = "Pa\$\$w0rd"

    private val adminRoleId = "SYSTEM_ADMIN"

    private val adminRoleScope = "g"

    private val userApi: UserApi = UserApi(host, baseClient)

    fun createUser(isAdminRights: Boolean = false, isEmailSet: Boolean = true, isNameSet: Boolean = true): TestUser {
        val userName = (if (isAdminRights) "admin" else "regular").appendRandomNumericPostfix()

        val newUser = User(
            username = userName,
            name =  if (isNameSet) "Name of $userName" else "",
            email = if (isEmailSet) "$userName@example.com" else "",
            password = defaultPassword,
            roles = if (isAdminRights) createAdminRole() else null)

        return TestUser(userApi.addUser(body = newUser), defaultPassword, isAdminRights)
    }

    fun deleteUser(user: TestUser) {
        userApi.deleteUser(user.userName)
    }

    private fun createAdminRole(): Roles {
        val adminRole = Role(
            roleId = adminRoleId,
            scope = adminRoleScope)

        return Roles(listOf(adminRole ))
    }
}