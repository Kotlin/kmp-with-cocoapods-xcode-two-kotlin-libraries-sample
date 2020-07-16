pluginManagement {
    repositories {
        mavenLocal()
        jcenter()
        gradlePluginPortal()
    }
}

enableFeaturePreview("GRADLE_METADATA")

rootProject.name = "xcode-two-kotlin-pods-sample"

include(
        ":firstKotlinPod",
        ":secondKotlinPod"
)