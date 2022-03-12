package com.leon.feature_home_screen.internal.data.repository

import com.leon.feature_home_screen.internal.data.mapper.NoteMapper
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import com.leon.lnotes.database.NoteDao
import javax.inject.Inject

internal class HomeScreenRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao,
    private val mapper: NoteMapper
) : HomeScreenRepository {
    override fun addNote(note: Note) {
        TODO("Not yet implemented")
    }

    override fun openNoteUseCase(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun searchNotes(searchQuery: String): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun getListNotes(): List<Note> {
        val notes = noteDao.getAllNote()
        return mapper.map(notes)
    }
}