plugins {
    java
    kotlin("jvm")
    id("com.eden.orchidPlugin")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    //implementation(project(":theme"))
    implementation("io.github.javaeden.orchid:OrchidCore:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidBsDoc:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidPages:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidAsciidoc:${Versions.ORCHID}")
    testImplementation("junit", "junit", "4.12")
}

// Use the 'BsDoc' theme, and view the site locally at 'http://localhost:8080'
orchid {
    theme = "BsDoc"
    baseUrl = "http://localhost:8080"
}