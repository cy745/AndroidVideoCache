plugins {
    id("com.android.library")
    kotlin("android")
    id("maven-publish")
}

android {
    namespace = "com.danikula"
    compileSdk = 34

    defaultConfig {
        minSdk = 9
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_7
        targetCompatibility = JavaVersion.VERSION_1_7
    }
}

dependencies {
    implementation("org.slf4j:slf4j-android:1.7.21")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components.getByName("release"))

                groupId = "com.lalilu.videocache"
                artifactId = "videocache"
                version = "2.7.2"
            }
        }
    }
}