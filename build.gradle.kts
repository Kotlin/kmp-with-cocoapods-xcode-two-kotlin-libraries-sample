plugins {
    kotlin("multiplatform").version("1.9.20-RC")
    kotlin("native.cocoapods").version("1.9.20-RC")
}

group = "org.example"
version = "1.0-SNAPSHOT"

kotlin {
    iosArm64()
    iosSimulatorArm64()
    iosX64()

    cocoapods {
        noPodspec()
        podfile = project.file("ios-app/Podfile")
    }
}