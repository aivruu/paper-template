@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    versionCatalogs {
        register("libs") {
            from(files("../gradle/libs.versions.tom"))
        }
    }
}

rootProject.name = "build-logic" 