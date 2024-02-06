plugins {
    `java-library`
}

dependencies {
    compileOnlyApi(libs.paper)
}

tasks {
	compileJava {
	    options.release.set(17)
	}
}
