package com.example.catimagesapp.di.module

import com.example.catimagesapp.presentation.favs.FavsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favsModule = module {

    single<CatsRepository> {
        CatsRepositoryImpl()
    }

    viewModel {
        FavsViewModel(catsRepos = get())
    }
}