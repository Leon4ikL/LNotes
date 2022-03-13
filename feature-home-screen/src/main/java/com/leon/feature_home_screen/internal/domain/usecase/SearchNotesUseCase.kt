package com.leon.feature_home_screen.internal.domain.usecase

import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.repository.HomeScreenRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

internal class SearchNotesUseCase @Inject constructor(private val repository: HomeScreenRepository) {
    operator fun invoke(searchQuery: String) : Flow<List<Note>> {
        return repository.searchNotes(searchQuery)
    }
}