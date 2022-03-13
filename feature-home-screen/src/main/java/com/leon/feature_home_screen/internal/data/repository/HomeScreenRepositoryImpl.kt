package com.leon.feature_home_screen.internal.data.repository

import com.leon.feature_home_screen.internal.data.mapper.NoteMapper
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import com.leon.lnotes.database.NoteDao
import kotlinx.coroutines.flow.Flow
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

    override fun searchNotes(searchQuery: String): Flow<List<Note>> {
        TODO("Not yet implemented")
    }

    override fun getListNotes(): Flow<List<Note>> {
        val notes = noteDao.getAllNote()
        return mapper.map(notes)
    }
}