plugins {
    id("devlog.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.devlog.androidmultimoduleexample"


    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(projects.feature.featureMain)



}