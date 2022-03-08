package com.leon.feature_home_screen.internal.data

import com.leon.feature_home_screen.internal.data.entity.NoteEntity
import com.leon.feature_home_screen.internal.domain.model.Label
import com.leon.feature_home_screen.internal.domain.model.ToDo
import javax.inject.Inject

internal class MockData @Inject constructor() {
    operator fun invoke(): List<NoteEntity> {
        var count = 0
        val data: MutableList<NoteEntity> = mutableListOf()
        data.add(NoteEntity(count, "Title ${count++}", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(count, "Title ${count++}", "QWera asdfjf fdfsfdsfs"))
        data.add(
            NoteEntity(
                id = count,
                title = "Title ${count++}",
                description = "QWera asdfjf fdfsfdsfs",
                todo = ToDo(id = 1, title = count.hashCode().toString(), done = false)
            )
        )
        data.add(NoteEntity(count, "Title ${count++}", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(count, "Title ${count++}", "QWera asdfjf fdfsfdsfs"))
        data.add(NoteEntity(
            id = count,
            title = "Title ${count++}",
            description = "QWera asdfjf fdfsfdsfs",
            todo = ToDo(id = 1, title = count.hashCode().toString(), done = false)
        ))
        data.add(NoteEntity(count, "Title ${count++}", "QWera asdfjf fdfsfdsfs", Label("Label")))

        return data
    }
}