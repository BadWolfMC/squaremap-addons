dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/") {
            mavenContent {
                snapshotsOnly()
                includeGroup("xyz.jpenilla")
            }
        }
        maven("https://jitpack.io/") {
            mavenContent {
                includeGroupByRegex("com\\.github\\..*")
            }
        }
    }
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "squaremap-addons"

include(":common")

// BadWolfMC only builds and maintains the addons used in production.
includeAddon("banners")
includeAddon("vanish")

fun includeAddon(addonName: String) {
    val name = "squaremap-$addonName"
    include(name)
    project(":$name").apply {
        projectDir = file("addons/$addonName")
    }
}
