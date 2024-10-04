rootProject.name = "LuckyResume"
include("LuckyResume-Resume")
include("LuckyResume-Auth")
include("LuckyResume-Common")
include("LuckyResume-Comment")

dependencyResolutionManagement {
    versionCatalogs {
        create("lib") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

