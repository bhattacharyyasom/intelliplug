package com.github.bhattacharyyasom.intelliplug.services

import com.intellij.openapi.project.Project
import com.github.bhattacharyyasom.intelliplug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
