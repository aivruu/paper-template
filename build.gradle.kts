plugins {
    `java-library`
    id("economy-checkstyle") apply false
    id("economy-spotless") apply false
}

subprojects {
    apply<JavaLibraryPlugin>()

    apply(plugin = "economy-checkstyle")
    apply(plugin = "economy-spotless")

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}