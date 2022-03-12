package com.leon.lnotes.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.leon.lnotes.database.entity.NoteEntity
import kotlinx.coroutines.internal.synchronized

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteListDao(): NoteDao

    companion object{

        private var INSTANCE: AppDatabase? = null
        private val LOOK = Any()
        private const val DB_NAME = "note.db"

        fun getInstance(application: Application): AppDatabase{
            INSTANCE?.let {
                return it
            }
            kotlin.synchronized(LOOK){
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                return db
            }
        }

    }
}