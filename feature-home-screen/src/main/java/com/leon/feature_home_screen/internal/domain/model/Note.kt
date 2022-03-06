package com.leon.feature_home_screen.internal.domain.model

internal data class Note(
    val id: Int,
    val title: String,
    val description: String,
    val notification: Notification?,
    val label: Label?
)
