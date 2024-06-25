plugins {
    kotlin("multiplatform").version("2.0.0")
    kotlin("native.cocoapods").version("2.0.0")
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