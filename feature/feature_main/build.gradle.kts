

plugins {

    id("devlog.android.feature")

 //   id("org.jetbrains.kotlin.android")
}
android


android {
    namespace = "com.devlog.feature_main"



}

dependencies {

    implementation(project(":feature:feature_login"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.lifecycle.viewModelCompose)
    implementation(libs.kotlinx.immutable)
    testImplementation(libs.junit)
}