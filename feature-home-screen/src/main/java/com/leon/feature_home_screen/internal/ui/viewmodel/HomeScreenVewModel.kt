package com.leon.feature_home_screen.internal.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leon.feature_home_screen.internal.domain.model.ListItem
import com.leon.feature_home_screen.internal.domain.model.Note
import com.leon.feature_home_screen.internal.domain.model.NoteItem
import com.leon.feature_home_screen.internal.domain.usecase.AddNoteUseCase
import com.leon.feature_home_screen.internal.domain.usecase.GetListNotesUseCase
import com.leon.feature_home_screen.internal.domain.usecase.OpenNoteUseCase
import com.leon.feature_home_screen.internal.domain.usecase.SearchNotesUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

internal class HomeScreenViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase,
    private val openNoteUseCase: OpenNoteUseCase,
    private val searchNotesUseCase: SearchNotesUseCase,
    private val getListNotesUseCase: GetListNotesUseCase
) : ViewModel() {

    private val _notes = MutableStateFlow<List<Note>>(emptyList())
    val notes: StateFlow<List<Note>> = _notes.asStateFlow()

    init {
        viewModelScope.launch {
            _notes.emitAll(getListNotesUseCase())
        }
    }


}