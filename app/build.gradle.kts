plugins {
    id("com.android.application")
    id("kotlin-android")

    // Hilt
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")

    id("com.dipien.releaseshub.gradle.plugin") version "2.0.2"
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.3")

    buildFeatures{
        dataBinding = true
    }

    defaultConfig {
        applicationId = "e.yoppie.hilt"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile(getDefaultProguardFile("proguard-android-optimize.txt"))
            proguardFile(file("proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

releasesHub {
    dependenciesBasePath = "buildSrc/src/main/java/"
    dependenciesClassNames = listOf("Dependencies.kt")
    pullRequestEnabled = true
    gitHubRepositoryOwner = "yoshiya12x"
    gitHubRepositoryName = "Hilt"
    pullRequestsMax = 5
    gitHubUserName = "yoshiya12x"
    gitHubUserEmail = "yoppie.bull@gmail.com"
}

dependencies {
    val kotlinVersion = "1.4.10"
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.33-beta")
    kapt("com.google.dagger:hilt-compiler:2.33-beta")
}

// Hilt
kapt {
    correctErrorTypes = true
}
