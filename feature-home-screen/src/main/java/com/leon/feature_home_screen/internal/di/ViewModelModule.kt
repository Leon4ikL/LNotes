package com.leon.feature_home_screen.internal.di

import androidx.lifecycle.ViewModel
import com.leon.feature_home_screen.internal.ui.viewmodel.HomeScreenViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeScreenViewModel::class)
    fun bindHomeScreenViewModel(viewModel: HomeScreenViewModel): ViewModel

}