package com.leon.feature_home_screen.internal.di

import androidx.lifecycle.ViewModel

internal class HomeScreenComponentViewModel : ViewModel() {
    val newHomeScreenComponent = DaggerHomeScreenComponent.builder().build()
}