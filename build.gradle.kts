plugins {
    kotlin("multiplatform").version("1.4.255-SNAPSHOT")
    kotlin("native.cocoapods").version("1.4.255-SNAPSHOT")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

kotlin {
    ios()

    cocoapods {
        noPodspec()
        podfile = project.file("ios-app/Podfile")
    }
}