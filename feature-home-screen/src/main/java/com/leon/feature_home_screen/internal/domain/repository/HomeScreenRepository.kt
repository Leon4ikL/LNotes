package com.leon.feature_home_screen.internal.domain.repository

import com.leon.feature_home_screen.internal.domain.model.Note

internal interface HomeScreenRepository {
    fun addNote(note: Note)

    fun openNoteUseCase(note: Note)

    suspend fun searchNotes(searchQuery: String): List<Note>

    suspend fun getListNotes(): List<Note>
}