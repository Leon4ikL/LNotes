package com.leon.lnotes

import android.app.Application
import com.leon.feature_home_screen.internal.di.HomeScreenDepsStore
import com.leon.lnotes.di.AppComponent
import com.leon.lnotes.di.DaggerAppComponent

class App : Application() {
    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        HomeScreenDepsStore.deps = appComponent
    }

}