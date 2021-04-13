object Dependencies {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.4.21"
    object Androidx{
        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val multiDex = "androidx.multidex:multidex:2.0.1"
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
        const val testJunit = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        const val cardView = "androidx.cardview:cardview:1.0.0"
        object Lifecycle{
            const val runtime = "androidx.lifecycle:lifecycle-runtime:2.2.0"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
            const val reactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams:2.2.0"
        }
        object Navigation{
            const val fragment = "androidx.navigation:navigation-fragment:2.3.2"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.3.2"
            const val ui = "androidx.navigation:navigation-ui:2.3.2"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:2.3.2"
        }
        object Room{
            const val runtime = "androidx.room:room-runtime:2.2.6"
            const val compiler = "androidx.room:room-compiler:2.2.6"
            const val rxJava2 = "androidx.room:room-rxjava2:2.2.6"
            const val guava = "androidx.room:room-guava:2.2.6"
            const val testing = "androidx.room:room-testing:2.2.6"
        }
    }
    const val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0"
    const val junit = "junit:junit:4.13.1"
    const val assertj = "org.assertj:assertj-core:3.19.0"
    const val robolectric = "org.robolectric:robolectric:4.5.1"
    const val jdk = "org.jetbrains.kotlin:kotlin-stdlib:1.4.21"
    object Firebase{
        const val core = "com.google.firebase:firebase-core:18.0.1"
        const val messaging = "com.google.firebase:firebase-messaging:21.0.1"
        const val crashlytics = "com.google.firebase:firebase-crashlytics:17.3.0"
    }
    const val material = "com.google.android.material:material:1.2.1"
    object RxJava{
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
        const val rxJava = "io.reactivex.rxjava2:rxjava:2.2.20"
        const val rxJava2RxKotlin = "io.reactivex.rxjava2:rxkotlin:2.4.0"
        const val rxKotlin = "io.reactivex:rxkotlin:1.0.0"
    }
    object RxBinding {
        const val rxBinding = "com.jakewharton.rxbinding4:rxbinding:4.0.0"
        const val core = "com.jakewharton.rxbinding4:rxbinding-core:4.0.0"
        const val appcompat = "com.jakewharton.rxbinding4:rxbinding-appcompat:4.0.0"
        const val drawarLayout = "com.jakewharton.rxbinding4:rxbinding-drawerlayout:4.0.0"
        const val recyclerView = "com.jakewharton.rxbinding4:rxbinding-recyclerview:4.0.0"
        const val slidingPaneLayout = "com.jakewharton.rxbinding4:rxbinding-slidingpanelayout:4.0.0"
        const val swipeRefreshLayout = "com.jakewharton.rxbinding4:rxbinding-swiperefreshlayout:4.0.0"
        const val viewPager = "com.jakewharton.rxbinding4:rxbinding-viewpager:4.0.0"
        const val material = "com.jakewharton.rxbinding4:rxbinding-material:4.0.0"
    }
    object Dagger{
        const val dagger = "com.google.dagger:dagger:2.31"
        const val compiler = "com.google.dagger:dagger-compiler:2.31"
    }
    object Coroutines{
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2"
    }
    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:2.9.0"
        const val adapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:2.9.0"
        const val coroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:1.0.0"
    }
    object Moshi {
        const val moshi = "com.squareup.moshi:moshi:1.11.0"
        const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:1.11.0"
        const val kotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:1.11.0"
    }
    object OkHttp {
        const val okhttp = "com.squareup.okhttp3:okhttp:4.9.0"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.0"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:4.9.0"
    }
    object Glide {
        const val glide = "com.github.bumptech.glide:glide:4.11.0"
        const val compiler = "com.github.bumptech.glide:compiler:4.11.0"
    }
    object Stetho {
        const val stetho = "com.facebook.stetho:stetho:1.5.1"
        const val okhttp3 = "com.facebook.stetho:stetho-okhttp3:1.5.1"
    }
    object Epoxy {
        const val epoxy = "com.airbnb.android:epoxy:4.3.1"
        const val processor = "com.airbnb.android:epoxy-processor:4.3.1"
        const val databinding = "com.airbnb.android:epoxy-databinding:4.3.1"
    }
    object Kotpref{
        const val kotpref = "com.chibatching.kotpref:kotpref:2.13.0"
        const val initializer = "com.chibatching.kotpref:initializer:2.13.0"
    }
    const val threetenabp = "com.jakewharton.threetenabp:threetenabp:1.3.0"
    object AwsSdk{
        const val core = "com.amazonaws:aws-android-sdk-core:2.22.0"
        const val sns = "com.amazonaws:aws-android-sdk-sns:2.22.0"
    }
    const val ossLicense = "com.google.android.gms:play-services-oss-licenses:17.0.0"
    object Hyperion {
        const val core = "com.willowtreeapps.hyperion:hyperion-core:0.9.30"
        const val attr = "com.willowtreeapps.hyperion:hyperion-attr:0.9.30"
        const val buildConfig = "com.willowtreeapps.hyperion:hyperion-build-config:0.9.30"
        const val crash = "com.willowtreeapps.hyperion:hyperion-crash:0.9.30"
        const val disk = "com.willowtreeapps.hyperion:hyperion-disk:0.9.30"
        const val geigerCounter = "com.willowtreeapps.hyperion:hyperion-geiger-counter:0.9.30"
        const val measurement = "com.willowtreeapps.hyperion:hyperion-measurement:0.9.30"
        const val phoenix = "com.willowtreeapps.hyperion:hyperion-phoenix:0.9.30"
        const val recorder = "com.willowtreeapps.hyperion:hyperion-recorder:0.9.30"
        const val sharedPreferences = "com.willowtreeapps.hyperion:hyperion-shared-preferences:0.9.30"
    }
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.6"
    const val truth = "com.google.truth:truth:1.1.2"
}
