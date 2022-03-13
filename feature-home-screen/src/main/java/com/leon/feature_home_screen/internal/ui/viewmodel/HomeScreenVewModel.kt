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
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
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
        getAllNotes()
    }

    fun getAllNotes(){
        viewModelScope.launch(Dispatchers.IO) {
            getListNotesUseCase.invoke().collect {
                _notes.value = it
                Log.e("Flow", it.toString())
            }
        }
    }





}