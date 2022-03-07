package com.leon.feature_home_screen.internal.data.mapper

import com.leon.feature_home_screen.internal.data.entity.NoteEntity
import com.leon.feature_home_screen.internal.domain.model.Note
import javax.inject.Inject

internal class NoteMapper @Inject constructor() {
    fun mapEntityToModel(noteEntity: NoteEntity) =
        Note(
            id = noteEntity.id,
            title = noteEntity.title,
            description = noteEntity.description,
            notification = noteEntity.notification,
            label = noteEntity.label
        )

    fun mapListEntityToListModel(list: List<NoteEntity>) = list.map {
        mapEntityToModel(it)
    }
}