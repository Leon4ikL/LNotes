package com.leon.lnotes.di

import android.app.Application
import com.leon.feature_home_screen.api.HomeScreenDeps
import com.leon.lnotes.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent : HomeScreenDeps {
    fun inject(application: Application)
}