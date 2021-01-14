buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.1.1")
    }

    //https://github.com/ge-org/multiplatform-swiftpackage/tree/b1e0f240d305dcea831fd3c088e12f432d62eb2c
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}
