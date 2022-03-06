package com.leon.feature_home_screen.internal.data.repository

import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import javax.inject.Inject

internal class HomeScreenRepositoryImpl @Inject constructor() : HomeScreenRepository {
    override fun addNote(note: Note) {
        TODO("Not yet implemented")
    }

    override fun openNoteUseCase(note: Note) {
        TODO("Not yet implemented")
    }

    override fun searchNotes(searchQuery: String): List<Note> {
        TODO("Not yet implemented")
    }

    override fun getListNotes(): List<Note> {
        TODO("Not yet implemented")
    }
}