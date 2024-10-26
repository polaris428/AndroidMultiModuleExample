include(":feature:feature_main")




pluginManagement {
    includeBuild("build-logic")

    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")

            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "AndroidMultiModuleExample"

include(":app")
include(":core")
include(":feature")
//include(":feature_login")
//include(":Feature:feature_login")

include(":feature:feature_login")
include(":core:data")

include(":core:design_system")
include(":core:domain")

