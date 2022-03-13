package com.leon.lnotes.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.leon.lnotes.database.entity.LabelDbEntity
import com.leon.lnotes.database.entity.NoteDbEntity

@Database(
    entities = [
        NoteDbEntity::class,
        LabelDbEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteListDao(): NoteDao
    abstract fun labelListDao(): LabelDao
    companion object {

        private var INSTANCE: AppDatabase? = null
        private val LOOK = Any()
        private const val DB_NAME = "note.db"

        fun getInstance(application: Application): AppDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOOK) {
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