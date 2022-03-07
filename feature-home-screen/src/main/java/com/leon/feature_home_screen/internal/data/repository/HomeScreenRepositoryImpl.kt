package com.leon.feature_home_screen.internal.data.repository

import com.leon.feature_home_screen.internal.data.MockData
import com.leon.feature_home_screen.internal.data.mapper.NoteMapper
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import javax.inject.Inject

internal class HomeScreenRepositoryImpl @Inject constructor(
    private val mockData: MockData,
    private val mapper: NoteMapper
) : HomeScreenRepository {
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
        return mapper.mapListEntityToListModel(mockData.invoke())
    }
}