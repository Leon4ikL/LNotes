package com.leon.feature_home_screen.internal.domain.usecase

import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import javax.inject.Inject

internal class GetListNotesUseCase @Inject constructor(
    private val repository: HomeScreenRepository
) {
    suspend operator fun invoke(): List<Note>{
        return repository.getListNotes()
    }
}