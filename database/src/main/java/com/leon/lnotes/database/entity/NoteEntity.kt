package com.leon.lnotes.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.leon.lnotes.common.Label
import com.leon.lnotes.common.Note
import com.leon.lnotes.common.Notification
import java.io.Serializable

@Entity(tableName = "notes")
data class NoteEntity(
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    override val id: Int = 0,
    @ColumnInfo(name = "title")
    override val title: String,
    @ColumnInfo(name = "description")
    override val description: String? = null,
//    @ColumnInfo(name = "label")
//    override val label: Label? = null,
//    @ColumnInfo(name = "notification")
//    override val notification: Notification?
) : Note, Serializable