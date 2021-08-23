package com.github.shouduzhanshi.test.services

import com.github.shouduzhanshi.test.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
