pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // instead of using maven { url "https://jitpack.io"} , use  maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://jitpack.io") }
        jcenter()
    }
}

rootProject.name = "First PDF Reader"
include(":app")
