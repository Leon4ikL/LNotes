package com.leon.lnotes

import android.app.Application
import com.leon.lnotes.di.AppComponent
import com.leon.lnotes.di.DaggerAppComponent

class App: Application() {
    private val appComponent: AppComponent by lazy{
        DaggerAppComponent.create()
    }

    override fun onCreate() {
        appComponent.inject(this)
        super.onCreate()
    }

}