package com.example.catimagesapp.presentation.favs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.catimagesapp.R
import com.example.catimagesapp.databinding.FragmentFavsBinding
import com.example.catimagesapp.presentation.base.BaseFragment
import com.example.catimagesapp.presentation.favs.adapter.CatsRecyclerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavsFragment : BaseFragment<FragmentFavsBinding>() {

    lateinit var catsAdapter: CatsRecyclerAdapter
    private val favsViewModel: FavsViewModel by viewModel()
    lateinit var binding: FragmentFavsBinding
    override fun constructViewBinding(): ViewBinding = FragmentFavsBinding.inflate(layoutInflater)

    override fun init(viewBinding: ViewBinding) {
        initRecycler()
    }
    fun initRecycler() {
        binding.catsRecyclerView.adapter = catsAdapter

        favsViewModel.items.observe(viewLifecycleOwner) {  cats ->
            catsAdapter.submitList(cats)
        }
    }

}