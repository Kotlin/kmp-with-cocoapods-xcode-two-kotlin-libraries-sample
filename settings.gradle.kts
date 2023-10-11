pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "xcode-two-kotlin-pods-sample"

include(
    ":firstKotlinPod",
    ":secondKotlinPod"
)