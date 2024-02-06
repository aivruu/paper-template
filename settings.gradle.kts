@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "plugin-template"

sequenceOf(
    "api",
    "plugin"
).forEach {
    val project = ":template-$it"
    include(project)
    project(project).projectDir = file(it)
}
