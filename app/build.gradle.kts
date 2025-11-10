plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.rjya"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.rjya"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("com.google.android.exoplayer:exoplayer:2.18.0")
    implementation("androidx.core:core-ktx:1.9.0") // Замените на актуальную версию
    implementation("androidx.appcompat:appcompat:1.5.0") // Замените на актуальную версию
    implementation("com.google.android.material:material:1.6.0") // Замените на актуальную версию
    implementation("androidx.activity:activity-ktx:1.6.0") // Замените на актуальную версию
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation(libs.androidx.activity)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx) // Замените на актуальную версию
    testImplementation("junit:junit:4.13.2") // Замените на актуальную версию
    androidTestImplementation("androidx.test.ext:junit:1.1.4") // Замените на актуальную версию
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0") // Замените на актуальную версию
}
