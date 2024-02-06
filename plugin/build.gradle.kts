plugins {
    java
    alias(libs.plugins.shadow)
    alias(libs.plugins.blossom)
}

val group = property("group") as String
val version = property("version") as String

tasks {
    build {
        dependsOn(shadowJar)
    }
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(17)
    }
    clean {
        delete("bin")
    }
    shadowJar {
        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("")

        destinationDirectory.set(file("$rootDir/bin/"))
        minimize()

        relocate("dev.triumphteam.cmd", "$group.libs.dev.triumphteam.cmd")
        relocate("org.spongepowered", "$group.libs.org.spongepowered")
        relocate("io.leangen.geantyref", "$group.libs.io.leangen.geantyref")
    }
}

blossom {
    replaceToken("{{version}}", version, "src/main/java/me/qeklydev/economy/Constants.java")
}

dependencies {
    api(project("api"))

    compileOnlyApi(libs.paper)
    
    api(libs.configurate.hocon)
    api(libs.command)
}