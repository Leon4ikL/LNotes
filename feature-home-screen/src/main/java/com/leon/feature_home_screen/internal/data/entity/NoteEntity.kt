package com.leon.feature_home_screen.internal.data.entity

import com.leon.feature_home_screen.internal.domain.model.Label
import com.leon.feature_home_screen.internal.domain.model.Notification

internal data class NoteEntity(
    val id: Int,
    val title: String,
    val description: String = "",
    val label: Label? = null,
    val notification: Notification? = null
)