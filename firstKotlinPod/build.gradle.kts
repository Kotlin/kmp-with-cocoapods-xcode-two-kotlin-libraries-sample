plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
}

group = "org.jetbrains.kotlin.sample"
version = "1.0-SNAPSHOT"

kotlin {
    iosArm64()
    iosSimulatorArm64()
    iosX64()

    cocoapods {
        summary = "Second Kotlin pod"
        homepage = "https://github.com/zoldater/cocoapodsMPPDemo/blob/master/secondKotlinPod"

        ios.deploymentTarget = "13.5"

        pod("AFNetworking", "~> 4.0.0")
    }
}