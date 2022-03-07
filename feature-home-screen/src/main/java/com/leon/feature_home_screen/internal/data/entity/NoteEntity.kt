package com.leon.feature_home_screen.internal.data.entity

import com.leon.feature_home_screen.internal.domain.model.Label
import com.leon.feature_home_screen.internal.domain.model.Notification
import com.leon.feature_home_screen.internal.domain.model.ToDo

internal data class NoteEntity(
    val id: Int,
    val title: String,
    val description: String = "",
    val label: Label? = null,
    val notification: Notification? = null,
    val todo: ToDo? = null
)