package com.example.catimagesapp.di.module

import com.example.catimagesapp.data.CatsApi
import com.example.catimagesapp.data.CatsRepositoryImpl
import com.example.catimagesapp.domain.repository.CatsRepository
import com.example.catimagesapp.presentation.favs.FavsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favsModule = module {


    single<CatsRepository> {
        CatsRepositoryImpl(catsApi = get())
    }

    viewModel {
        FavsViewModel(catsRepos = get())
    }
}