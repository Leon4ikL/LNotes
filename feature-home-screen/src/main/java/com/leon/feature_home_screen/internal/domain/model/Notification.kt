package com.leon.feature_home_screen.internal.domain.model

internal data class Notification(
    val time: Long,
    val date: Int,
    val repeat: Boolean
)