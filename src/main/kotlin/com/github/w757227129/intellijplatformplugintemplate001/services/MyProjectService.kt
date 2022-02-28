package com.github.w757227129.intellijplatformplugintemplate001.services

import com.intellij.openapi.project.Project
import com.github.w757227129.intellijplatformplugintemplate001.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
