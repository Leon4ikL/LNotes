package com.leon.feature_home_screen.internal.domain.model

internal interface Note: ListItem{
    override val id: Int
    val title: String
    val description: String?
    val label: Label?
    val notification: Notification?
}
