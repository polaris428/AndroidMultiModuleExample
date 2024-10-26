plugins {
    id("devlog.android.library")
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.devlog.domain"

}

dependencies {
    implementation(project(":core:data"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}