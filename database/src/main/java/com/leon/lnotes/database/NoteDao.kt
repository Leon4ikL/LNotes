package com.leon.lnotes.database

import androidx.room.*
import com.leon.lnotes.database.entity.NoteEntity

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    suspend fun getAllNote() : List<NoteEntity>

    @Query("SELECT * FROM notes WHERE id=:id")
    suspend fun getNoteById(id: Int) : NoteEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteEntity: NoteEntity)

    @Update
    suspend fun editNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

}