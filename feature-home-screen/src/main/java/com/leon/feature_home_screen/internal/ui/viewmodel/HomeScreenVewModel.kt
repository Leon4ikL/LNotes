package com.leon.feature_home_screen.internal.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.leon.feature_home_screen.internal.domain.usecase.AddNoteUseCase
import com.leon.feature_home_screen.internal.domain.usecase.OpenNoteUseCase
import com.leon.feature_home_screen.internal.domain.usecase.SearchNotesUseCase
import javax.inject.Inject

internal class HomeScreenViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase,
    private val openNoteUseCase: OpenNoteUseCase,
    private val searchNotesUseCase: SearchNotesUseCase
) : ViewModel() {



}