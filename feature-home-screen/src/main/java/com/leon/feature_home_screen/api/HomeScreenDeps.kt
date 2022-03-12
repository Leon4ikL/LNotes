package com.leon.feature_home_screen.api

import com.leon.lnotes.database.NoteDao
import kotlin.properties.Delegates

interface HomeScreenDeps {
    val noteDao: NoteDao
}

