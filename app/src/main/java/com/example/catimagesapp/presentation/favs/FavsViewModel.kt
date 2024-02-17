package com.example.catimagesapp.presentation.favs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.dsl.module

class FavsViewModel(catsRepos: CatsRepository) : ViewModel()  {


}

val appModule = module { 
    single<CatsRepository> {CatsRepositoryImpl()}

    viewModel {FavsViewModel(get())}
}
