package com.leon.feature_home_screen.api

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.leon.feature_home_screen.databinding.FragmentHomeScreenBinding
import com.leon.feature_home_screen.internal.ui.adapter.HomeScreenDelegates
import com.leon.feature_home_screen.internal.domain.model.NoteItem
import com.leon.feature_home_screen.internal.domain.model.NoteToDoItem
import com.leon.feature_home_screen.internal.domain.model.ToDo


class HomeScreenFragment : Fragment() {

    private var _binding: FragmentHomeScreenBinding? = null
    private val binding: FragmentHomeScreenBinding
        get() = _binding ?: throw RuntimeException("FragmentHomeScreenBinding == null")

    private val adapter = ListDelegationAdapter(
        HomeScreenDelegates.noteToDoItemDelegate(),
        HomeScreenDelegates.noteItemDelegate()
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeScreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            recyclerView.adapter = adapter

            adapter.apply {
                items = listOf(
                    NoteItem(id = 1, title = "222", description = "12eqw"),
                    NoteToDoItem(id = 2, title = "QWerrrt", description = "Wqweqwe",
                        todo = ToDo(1,false,"Bread"),)

                )
                notifyDataSetChanged()
            }
        }
    }

}