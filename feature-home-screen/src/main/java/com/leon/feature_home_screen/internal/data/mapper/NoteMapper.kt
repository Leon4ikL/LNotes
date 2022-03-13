package com.leon.feature_home_screen.internal.data.mapper

import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.model.NoteItem
import com.leon.lnotes.database.entity.NoteDbEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

internal class NoteMapper @Inject constructor() {


    private fun mapNoteEntityToNote(list: List<NoteDbEntity>) = list.map {
        NoteItem(
            id = it.id,
            title = it.title,
            description = it.description
        )
    }

    fun map(list: Flow<List<NoteDbEntity>>) = list.map {
        mapNoteEntityToNote(it)
    }
}
