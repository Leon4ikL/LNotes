package com.leon.feature_home_screen.internal.domain.model

import com.leon.feature_home_screen.internal.domain.model.Label
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.model.Notification

internal data class NoteItem(
    override val id: Int,
    override val title: String,
    override val label: Label? = null,
    override val notification: Notification? = null,
    override val description: String? = null
) : Note