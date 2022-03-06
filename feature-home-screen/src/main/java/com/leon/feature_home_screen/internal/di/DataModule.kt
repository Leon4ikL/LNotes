package com.leon.feature_home_screen.internal.di

import com.leon.feature_home_screen.internal.data.repository.HomeScreenRepositoryImpl
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import dagger.Binds
import dagger.Module

@Module
internal interface DataModule {
    @Binds
    fun bindHomeScreenRepository(impl: HomeScreenRepositoryImpl) : HomeScreenRepository
}