plugins {
    base
    kotlin("jvm") version Versions.KOTLIN
    id("com.eden.orchidPlugin") version Versions.ORCHID apply false //applies only to the submodules who ask for it
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
