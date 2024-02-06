plugins {
    `java-library`
    id("template-checkstyle") apply false
    id("template-spotless") apply false
}

subprojects {
    apply<JavaLibraryPlugin>()

    apply(plugin = "template-checkstyle")
    apply(plugin = "template-spotless")

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}
