package com.leon.lnotes.common

import java.io.Serializable

data class Notification(
    val date: String,
    val time: String
): Serializable
