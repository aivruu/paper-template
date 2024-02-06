plugins {
    checkstyle
}

configure<CheckstyleExtension> {
    configFile = rootProject.file("config/checkstyle/checkstyle.xml")
    maxErrors = 0
    maxWarnings = 0
    toolVersion = "10.9.3"
}
