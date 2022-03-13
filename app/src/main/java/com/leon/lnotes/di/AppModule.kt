package com.leon.lnotes.di

import android.app.Application
import com.leon.lnotes.database.AppDatabase
import com.leon.lnotes.database.LabelDao
import com.leon.lnotes.database.NoteDao
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class AppModule{
    @Provides
    fun provideDatabase(application: Application) : AppDatabase =
        AppDatabase.getInstance(application)

    @Provides
    fun provideNoteDao(appDatabase: AppDatabase) : NoteDao =
        appDatabase.noteListDao()

    @Provides
    fun provideLabelDao(appDatabase: AppDatabase) : LabelDao =
        appDatabase.labelListDao()
}