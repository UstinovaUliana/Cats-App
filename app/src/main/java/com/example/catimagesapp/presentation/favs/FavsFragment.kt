package com.example.catimagesapp.presentation.favs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.catimagesapp.R
import com.example.catimagesapp.databinding.FragmentFavsBinding
import com.example.catimagesapp.presentation.base.BaseFragment
import com.example.catimagesapp.presentation.favs.adapter.CatsRecyclerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel
import javax.inject.Inject

class FavsFragment : BaseFragment<FragmentFavsBinding> {

    @Inject
    lateinit var catsAdapter: CatsRecyclerAdapter

    private val favsViewModel: FavsViewModel by viewModel()

}