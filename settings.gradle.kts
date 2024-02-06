@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.triumph.team/snapshots/")
    }
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "economy-test"

sequenceOf(
    "api",
    "plugin"
).forEach {
    val project = ":economy-$it"
    include(project)
    project(project).projectDir = file(it)
}
