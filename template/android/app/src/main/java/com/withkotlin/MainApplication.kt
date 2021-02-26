package com.withkotlin

import android.app.Application
import com.facebook.react.BuildConfig
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.soloader.SoLoader

class MainApplication : Application(), ReactApplication {
    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }

    override fun getReactNativeHost(): ReactNativeHost {
        return object : ReactNativeHost(this) {
            override fun getPackages() = PackageList(this).packages
            override fun getUseDeveloperSupport() = BuildConfig.DEBUG
            override fun getJSMainModuleName() = JSMainModuleName
        }
    }

    companion object {
        const val JSMainModuleName = "index"
    }
}