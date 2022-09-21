buildscript {
    dependencies {
//        classpath("io.realm.kotlin:gradle-plugin:1.0.2")
    }
}

plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.3.0").apply(false)
    id("com.android.library").version("7.3.0").apply(false)
    id("org.jetbrains.compose") version "1.1.1" apply false
    id("io.realm.kotlin") version "1.0.2" apply false
    kotlin("android").version("1.6.10").apply(false)
    kotlin("multiplatform").version("1.6.10").apply(false)
    kotlin("plugin.serialization").version("1.6.10").apply(false)
}
