package com.makrol.teamcity.api.wrapper

import com.makrol.teamcity.api.swagger.client.api.UserApi
import com.makrol.teamcity.api.swagger.client.model.Role
import com.makrol.teamcity.api.swagger.client.model.Roles
import com.makrol.teamcity.api.swagger.client.model.User
import com.makrol.teamcity.data.models.TestUser
import com.makrol.teamcity.utilities.helpers.appendRandomNumericPostfix

class UserApiWrapper : BaseApiClient() {
    private val defaultPassword = "Pa$\$w0rd"

    private val adminRoleId = "SYSTEM_ADMIN"

    private val adminRoleScope = "g"

    private val userApi: UserApi = UserApi(baseClient)

    fun createUser(isAdminRights: Boolean = false, isEmailSet: Boolean = true, isNameSet: Boolean = true): TestUser {
        val userName = (if (isAdminRights) "admin" else "regular").appendRandomNumericPostfix()

        val newUser = User()
        newUser.username = userName
        newUser.name = if (isNameSet) "Name of $userName" else ""
        newUser.email = if (isEmailSet) "$userName@example.com" else ""
        newUser.password = defaultPassword

        if (isAdminRights) {
            newUser.roles = createAdminRole()
        }

        return TestUser(userApi.addUser(newUser, null), defaultPassword, isAdminRights)
    }

    fun deleteUser(user: TestUser) {
        userApi.deleteUser(user.userName)
    }

    private fun createAdminRole(): Roles {
        val adminRole = Role()
        adminRole.roleId = adminRoleId
        adminRole.scope = adminRoleScope
        val roles = Roles()
        roles.addRoleItem(adminRole)

        return roles
    }
}