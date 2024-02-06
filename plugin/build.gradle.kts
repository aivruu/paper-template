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

        relocate("org.spongepowered", "$group.libs.org.spongepowered")
        relocate("io.leangen.geantyref", "$group.libs.io.leangen.geantyref")
    }
}

sourceSets {
    main {
        blossom {
            javaSources {
                property("version", version)
            }
        }
    }
}

dependencies {
    api(project(":template-api"))
    api(libs.configurate.hocon)

    compileOnlyApi(libs.paper)
}
