plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "app.vercel.danfelogarPorfolios.horoscoapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "app.vercel.danfelogarPorfolios.horoscoapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isDebuggable = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            resValue("string","HoroscoApp", "Danfelogar Dev" )

            buildConfigField("String","BASE_URL", "\"https://newastro.vercel.app\"")
        }

        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            resValue("string", "HoroscoApp","[Debug Mode] Danfelogar Dev")
            buildConfigField("String","BASE_URL", "\"https://newastro.vercel.app\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    //available methods for access all ui with ids
    buildFeatures {
        resValues = true
        viewBinding = true
        buildConfig = true
    }
}

dependencies {

    val navVersion = "2.8.8"

    //Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

    //DaggerHilt
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-compiler:2.48")

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    //interceptors of response
    implementation("com.squareup.okhttp3:logging-interceptor:4.3.1")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}