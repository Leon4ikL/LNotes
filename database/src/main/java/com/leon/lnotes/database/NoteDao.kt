package com.leon.lnotes.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.leon.lnotes.database.entity.NoteDbEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAllNote() : Flow<List<NoteDbEntity>>

    @Query("SELECT * FROM notes WHERE note_id=:id")
    fun getNoteById(id: Int) : Flow<NoteDbEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteDbEntity: NoteDbEntity)

    @Update
    suspend fun editNote(noteDbEntity: NoteDbEntity)

    @Delete
    suspend fun deleteNote(noteDbEntity: NoteDbEntity)



}