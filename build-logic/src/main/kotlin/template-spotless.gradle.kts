import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessPlugin

apply<SpotlessPlugin>()

configure<SpotlessExtension> {
    java {
        licenseHeaderFile(rootProject.file("HEADER.txt"))
    }
}
