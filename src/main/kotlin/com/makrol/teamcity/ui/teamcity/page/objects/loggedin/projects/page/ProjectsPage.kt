package com.makrol.teamcity.ui.teamcity.page.objects.loggedin.projects.page

import com.makrol.teamcity.ui.annotations.ImplicitCheck
import com.makrol.teamcity.ui.annotations.PageUrlPath
import com.makrol.teamcity.ui.teamcity.page.objects.loggedin.LoggedInPage

@PageUrlPath("/favorite/projects")
class ProjectsPage : LoggedInPage() {

    @ImplicitCheck(isVisible = true)
    val projectsView = ProjectsView()
}