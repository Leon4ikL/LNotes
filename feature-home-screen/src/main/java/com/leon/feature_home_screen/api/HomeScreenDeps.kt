package com.leon.feature_home_screen.api

import com.leon.lnotes.database.LabelDao
import com.leon.lnotes.database.NoteDao

interface HomeScreenDeps {
    val noteDao: NoteDao
    val labelDao: LabelDao
}