package com.leon.lnotes.di

import android.app.Application
import com.leon.lnotes.database.AppDatabase
import com.leon.lnotes.database.NoteDao
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class AppModule{
    @Provides
    fun provideDatabase(application : Application) : NoteDao =
        AppDatabase.getInstance(application).noteListDao()
}