package com.leon.feature_home_screen.internal.domain.usecase

import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import javax.inject.Inject

internal class AddNoteUseCase @Inject constructor(private val repository: HomeScreenRepository){
    operator fun invoke(note: Note){
        repository.addNote(note = note)
    }
}