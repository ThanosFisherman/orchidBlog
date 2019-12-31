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
    implementation(project(":theme"))
    orchidCompile("io.github.javaeden.orchid:OrchidCore:0.18.0")
    orchidCompile ("io.github.javaeden.orchid:OrchidBsDoc:0.18.0")
    orchidCompile ("io.github.javaeden.orchid:OrchidPages:0.18.0")
    orchidCompile ("io.github.javaeden.orchid:OrchidAsciidoc:0.18.0")
    testCompile("junit", "junit", "4.12")
}

// Use the 'BsDoc' theme, and view the site locally at 'http://localhost:8080'
orchid {
    theme = "BsDoc"
    baseUrl = "http://localhost:8080"
}