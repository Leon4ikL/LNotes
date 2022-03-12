package com.leon.feature_home_screen.internal.data.mapper

import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.model.NoteItem
import com.leon.feature_home_screen.internal.domain.model.NoteToDoItem
import com.leon.lnotes.database.entity.NoteEntity
import javax.inject.Inject

internal class NoteMapper @Inject constructor() {
    private fun mapNoteEntityToNote(noteEntity: NoteEntity) = NoteItem(
        id = noteEntity.id,
        title = noteEntity.title
    )

    fun map(list: List<NoteEntity>) = list.map {
        mapNoteEntityToNote(it)
    }
}
