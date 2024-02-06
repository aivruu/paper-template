plugins {
    `kotlin-dsl`
    alias(libs.plugins.spotless)
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${libs.plugins.spotless.get().version}")
}

spotless {
    kotlin { 
        licenseHeaderFile(rootProject.file("../HEADER.txt"))
    }
}
