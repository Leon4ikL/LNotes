package com.leon.feature_home_screen.internal.di

import com.leon.feature_home_screen.api.HomeScreenDeps
import com.leon.feature_home_screen.api.HomeScreenFragment
import dagger.Component

@Component(
    modules = [
        ViewModelModule::class,
        DataModule::class
    ],
    dependencies = [HomeScreenDeps::class]
)
internal interface HomeScreenComponent {
    fun inject(homeScreen: HomeScreenFragment)
    @Component.Builder
    interface Builder{
        fun deps(deps: HomeScreenDeps) : Builder
        fun build() : HomeScreenComponent
    }
}

