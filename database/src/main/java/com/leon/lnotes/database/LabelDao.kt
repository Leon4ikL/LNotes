package com.leon.lnotes.database

import androidx.room.*
import com.leon.lnotes.database.entity.LabelDbEntity

@Dao
interface LabelDao {
    @Query("SELECT * FROM label")
    suspend fun getLabel() : List<LabelDbEntity>

    @Query("SELECT * FROM label WHERE label_id=:id")
    suspend fun getLabelById(id: Int) : LabelDbEntity

    @Insert
    suspend fun addLabel(label: LabelDbEntity)

    @Update
    suspend fun updateLabel(label: LabelDbEntity)

    @Delete
    suspend fun deleteLabel(label: LabelDbEntity)

}