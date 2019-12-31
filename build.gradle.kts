plugins {
    base
    kotlin("jvm") version Versions.KOTLIN
    id("com.eden.orchidPlugin") version "0.18.0"
}

buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }
    dependencies {}
}
allprojects {

    group = "io.github.thanosfisherman"

    version = "1.0"

    repositories {
        jcenter()
        mavenCentral()
    }
}
