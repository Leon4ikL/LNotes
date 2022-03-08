package com.leon.feature_home_screen.internal.ui.adapter

import android.util.Log
import android.view.View
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.leon.feature_home_screen.databinding.ItemNoteBinding
import com.leon.feature_home_screen.databinding.ItemNoteTodoBinding
import com.leon.feature_home_screen.databinding.ItemTodoBinding
import com.leon.feature_home_screen.internal.domain.model.ListItem
import com.leon.feature_home_screen.internal.domain.model.NoteItem
import com.leon.feature_home_screen.internal.domain.model.NoteToDoItem
import com.leon.feature_home_screen.internal.domain.model.ToDo

internal object HomeScreenDelegates {
    fun noteItemDelegate() =
        adapterDelegateViewBinding<NoteItem, ListItem, ItemNoteBinding>(
            { layoutInflater, parent ->
                ItemNoteBinding.inflate(layoutInflater, parent, false)
            }
        ) {
            bind {
                with(binding) {
                    titleTextView.text = item.title
                    descriptionTextView.text = item.description
                    if (item.notification == null) {
                        notificationImageView.visibility = View.GONE
                    }
                    if (item.label == null) {
                        labelTextView.visibility = View.GONE
                    }
                }
            }
        }

    fun noteToDoItemDelegate() =
        adapterDelegateViewBinding<NoteToDoItem, ListItem, ItemNoteTodoBinding>(
            { layoutInflater, parent ->
                ItemNoteTodoBinding.inflate(layoutInflater, parent, false)
            }
        ) {
            val adapter = ListDelegationAdapter(todoItemDelegate())
            binding.todo.adapter = adapter
            bind {

                binding.titleTextView.text = item.title
                binding.descriptionTextView.text = item.description

                adapter.items = listOf(item.todo)

                Log.e("TODO", item.todo.title)
                if (item.notification == null) {
                    binding.notificationImageView.visibility = View.GONE
                }
                if (item.label == null) {
                    binding.labelTextView.visibility = View.GONE
                }
            }
        }

    private fun todoItemDelegate() =
        adapterDelegateViewBinding<ToDo, ListItem, ItemTodoBinding>(
            { layoutInflater, parent ->
                ItemTodoBinding.inflate(layoutInflater, parent, false)
            }
        ) {
            bind {
                with(binding) {
                    checkBox.text = item.title
                }
            }
        }

}