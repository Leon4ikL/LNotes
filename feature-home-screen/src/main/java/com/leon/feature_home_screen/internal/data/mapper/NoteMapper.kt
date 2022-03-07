package com.leon.feature_home_screen.internal.data.mapper

import com.leon.feature_home_screen.internal.data.entity.NoteEntity
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.model.NoteItem
import com.leon.feature_home_screen.internal.domain.model.NoteToDoItem
import javax.inject.Inject

internal class NoteMapper @Inject constructor() {
    private fun mapNoteEntityToNoteItemModel(noteEntity: NoteEntity) =
        NoteItem(
            id = noteEntity.id,
            title = noteEntity.title,
            description = noteEntity.description,
            notification = noteEntity.notification,
            label = noteEntity.label
        )

    private fun mapNoteEntityToNoteTodoItemModel(noteEntity: NoteEntity) = NoteToDoItem(
            id = noteEntity.id,
            title = noteEntity.title,
            description = noteEntity.description,
            notification = noteEntity.notification,
            label = noteEntity.label,
            todo = noteEntity.todo!!
        )


    fun map(list: List<NoteEntity>) = list.map {
        if (it.todo != null) {
            mapNoteEntityToNoteTodoItemModel(it)
        } else {
            mapNoteEntityToNoteItemModel(it)
        }
    }
}
