buildscript {
    val kotlinVersion = "1.4.10"
    repositories {
        google()
        jcenter()
        // Hilt
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        // Hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.33-beta")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.create("clean", type = Delete::class){
    delete(rootProject.buildDir)
}
