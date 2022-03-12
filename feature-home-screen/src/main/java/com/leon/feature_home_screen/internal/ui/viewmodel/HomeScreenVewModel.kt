package com.leon.feature_home_screen.internal.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leon.feature_home_screen.internal.domain.model.ListItem
import com.leon.feature_home_screen.internal.domain.usecase.AddNoteUseCase
import com.leon.feature_home_screen.internal.domain.usecase.GetListNotesUseCase
import com.leon.feature_home_screen.internal.domain.usecase.OpenNoteUseCase
import com.leon.feature_home_screen.internal.domain.usecase.SearchNotesUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class HomeScreenViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase,
    private val openNoteUseCase: OpenNoteUseCase,
    private val searchNotesUseCase: SearchNotesUseCase,
    private val getListNotesUseCase: GetListNotesUseCase
) : ViewModel() {

    fun getList() : List<ListItem>{
        val list: MutableList<ListItem> = mutableListOf()
        viewModelScope.launch(Dispatchers.IO){
            list.addAll(getListNotesUseCase.invoke())
        }
        return list
    }



}