rootProject.name = "Learning"


dependencyResolutionManagement {
    repositories {
        mavenCentral()
1    }
}


pluginManagement {
    repositories{
        gradlePluginPortal()
        google()
    }
    includeBuild("./buildlogic")

}


// includes("subprojects/modules");
