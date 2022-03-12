package com.leon.feature_home_screen.api

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.leon.feature_home_screen.databinding.FragmentHomeScreenBinding
import com.leon.feature_home_screen.internal.di.HomeScreenComponentViewModel
import com.leon.feature_home_screen.internal.ui.adapter.HomeScreenDelegates
import com.leon.feature_home_screen.internal.ui.viewmodel.HomeScreenViewModel
import com.leon.feature_home_screen.internal.ui.viewmodel.ViewModelFactory
import javax.inject.Inject


class HomeScreenFragment : Fragment() {

    @Inject
    internal lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[HomeScreenViewModel::class.java]
    }

    private var _binding: FragmentHomeScreenBinding? = null

    private val binding: FragmentHomeScreenBinding
        get() = _binding ?: throw RuntimeException("FragmentHomeScreenBinding == null")

    private val adapter = ListDelegationAdapter(
        HomeScreenDelegates.noteToDoItemDelegate(),
        HomeScreenDelegates.noteItemDelegate()
    )

    override fun onAttach(context: Context) {
        ViewModelProvider(this).get<HomeScreenComponentViewModel>()
            .newHomeScreenComponent.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = viewModel.getList()
        Log.e("View", list.toString())
        with(binding) {
            recyclerView.adapter = adapter
            adapter.apply {
                items = list
                notifyDataSetChanged()
            }
        }
    }

}