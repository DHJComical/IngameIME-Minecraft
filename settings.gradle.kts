pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        maven {
            // RetroFuturaGradle
            name = "GTNH Maven"
            url = uri("https://nexus.gtnewhorizons.com/repository/public/")
            isAllowInsecureProtocol = true
            mavenContent {
                includeGroup("com.gtnewhorizons.retrofuturagradle")
            }
        }
    }
}

rootProject.name = "IngameIME-Minecraft"
include(":IngameIME-Native", ":1.7.10")
