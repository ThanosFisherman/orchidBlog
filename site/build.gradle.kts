plugins {
    java
    kotlin("jvm")
    id("com.eden.orchidPlugin")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    orchidImplementation("io.github.javaeden.orchid:OrchidCore:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidPosts:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidPages:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidAsciidoc:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidSourceDoc:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidGithub:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidSyntaxHighlighter:${Versions.ORCHID}")
    orchidImplementation("io.github.javaeden.orchid:OrchidPluginDocs:${Versions.ORCHID}")
    testImplementation("junit", "junit", "4.12")
}
