package com.leon.feature_home_screen.internal.domain.model

import com.leon.feature_home_screen.internal.domain.model.Label
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.model.Notification
import com.leon.feature_home_screen.internal.domain.model.ToDo

internal data class NoteToDoItem(
    val todo: ToDo,
    override val id: Int,
    override val title: String,
    override val description: String? = null,
    override val label: Label? = null,
    override val notification: Notification? = null
) : Note