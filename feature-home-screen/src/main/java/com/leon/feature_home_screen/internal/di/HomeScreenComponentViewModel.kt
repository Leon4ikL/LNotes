package com.leon.feature_home_screen.internal.di

import androidx.lifecycle.ViewModel
import com.leon.feature_home_screen.api.HomeScreenDeps
import kotlin.properties.Delegates.notNull

internal class HomeScreenComponentViewModel : ViewModel() {
    val newHomeScreenComponent = DaggerHomeScreenComponent.builder().deps(HomeScreenDepsProvider.deps).build()
}

internal interface HomeScreenDepsProvider{
    val deps: HomeScreenDeps
    companion object : HomeScreenDepsProvider by HomeScreenDepsStore
}

object HomeScreenDepsStore: HomeScreenDepsProvider{
    override var deps: HomeScreenDeps by notNull()
}