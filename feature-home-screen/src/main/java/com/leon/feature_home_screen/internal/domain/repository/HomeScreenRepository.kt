package com.leon.feature_home_screen.internal.domain.repository

import com.leon.feature_home_screen.internal.domain.model.Note
import kotlinx.coroutines.flow.Flow

internal interface HomeScreenRepository {
    fun addNote(note: Note)

    fun openNoteUseCase(note: Note)

    fun getListNotes(): Flow<List<Note>>

    fun searchNotes(searchQuery: String): Flow<List<Note>>
}