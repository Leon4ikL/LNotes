package com.leon.feature_home_screen.internal.domain.model

internal data class ToDo (
    override val id: Int,
    val done: Boolean,
    val title: String
): ListItem