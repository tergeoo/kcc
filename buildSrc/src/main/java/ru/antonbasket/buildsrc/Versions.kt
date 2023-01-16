package ru.antonbasket.buildsrc

class Versions {
    object Versions {
        const val lifecycle = "2.5.1"
        const val nav = "2.5.3"
        const val core = "1.9.0"
        const val koin = "3.2.2"
        const val compose_version = "1.3.2"
        const val recyclerview_v = "1.2.1"
        const val activity = "1.6.1"
        const val appcompat_v = "1.5.1"
        const val kotlinx_coroutines = "1.6.4"
        const val material = "1.7.0"
        const val constraint_layout = "2.1.4"
        const val serialization = "1.4.1"
        const val gson = "2.10.1"
        const val fragment = "1.5.5"
        const val room = "2.5.0"
        const val junit = "4.13.2"
        const val ext_junit = "1.1.5"
        const val espresso_core = "3.5.1"
        const val jvmTarget = "1.8"
        const val kotlinCompilerVersion = "1.6.10"
    }

    object Deps {
        const val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val compose_ui = "androidx.compose.ui:ui:${Versions.compose_version}"
        const val compose_material = "androidx.compose.material:material:${Versions.compose_version}"
        const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
        const val koin_android = "org.koin:koin-android:${Versions.koin}"
        const val koin_android_scope = "org.koin:koin-android-scope:${Versions.koin}"
        const val core_ktx = "androidx.core:core-ktx:${Versions.core}"
        const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
        const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
        const val recyclerview_d = "androidx.recyclerview:recyclerview:${Versions.recyclerview_v}"
        const val activity_ktx = "androidx.activity:activity-ktx:${Versions.activity}"
        const val appcompat_d = "androidx.appcompat:appcompat:${Versions.appcompat_v}"
        const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinx_coroutines}"
        const val lifecycle_viewmodel_compose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
        const val activity_compose = "androidx.activity:activity-compose:${Versions.activity}"
        const val material_d = "com.google.android.material:material:${Versions.material}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
        const val kotlinx_serialization_json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"
        const val code_gson = "com.google.code.gson:gson:${Versions.gson}"
        const val fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val kotlinx_serialization_core_jvm = "org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:${Versions.serialization}"
        const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object DepsTest {
        const val junitTest = "junit:junit:${Versions.junit}"
        const val extJunitTest = "androidx.test.ext:junit:${Versions.ext_junit}"
        const val espressoCoreTest = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    }
}