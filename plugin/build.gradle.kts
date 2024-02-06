plugins {
    java
    alias(libs.plugins.shadow)
    alias(libs.plugins.blossom)
}

val version = property("version") as String

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set = 17
    }
    clean {
        delete("bin")
    }
    shadowJar {

    }
}

blossom {
    replaceToken("{{version}}", version, "src/main/java/me/qeklydev/economy/Constants.java")
}

dependencies {
    api(project(":api"))

    compileOnlyApi(libs.paper)
    
    api(libs.configurate.hocon)
    api(libs.command)
}