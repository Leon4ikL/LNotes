package com.leon.feature_home_screen.internal.data

import com.leon.feature_home_screen.internal.data.entity.NoteEntity
import javax.inject.Inject

internal class MockData @Inject constructor(){
    operator fun invoke(): List<NoteEntity>{
        val data: MutableList<NoteEntity> = mutableListOf()
        data.add(NoteEntity(0,"Title", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(1,"Title", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(2,"Title", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(3,"Title", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(4,"Title", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(5,"Title", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(6,"Title", "QWera asdfjf fdfsfdsfs"))
        return data
    }
}