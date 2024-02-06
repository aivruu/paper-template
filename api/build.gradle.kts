plugins {
    `java-library`
}

dependencies {
    compileOnlyApi(libs.paper)
    compileOnlyApi(libs.mongodb.driver)
}

tasks {
	compileJava {
	    options.release.set(17)
	}
}