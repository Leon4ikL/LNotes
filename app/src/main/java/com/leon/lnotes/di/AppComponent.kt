package com.leon.lnotes.di

import android.app.Application
import com.leon.feature_home_screen.api.HomeScreenDeps
import com.leon.lnotes.database.NoteDao
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent : HomeScreenDeps {

    override val noteDao: NoteDao

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

}