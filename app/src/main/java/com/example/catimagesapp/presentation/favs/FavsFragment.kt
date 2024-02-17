package com.example.catimagesapp.presentation.favs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.catimagesapp.R
import com.example.catimagesapp.presentation.favs.adapter.CatsRecyclerAdapter
import javax.inject.Inject

class FavsFragment : Fragment() {

    @Inject
    lateinit var catsAdapter: CatsRecyclerAdapter

    private val favsViewModel: FavsViewModel by viewModel()

}