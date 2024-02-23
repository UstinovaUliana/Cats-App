package com.example.catimagesapp.di.module

import com.example.catimagesapp.data.CatsApi
import com.example.catimagesapp.data.CatsRepositoryImpl
import com.example.catimagesapp.domain.repository.CatsRepository
import com.example.catimagesapp.presentation.favs.FavsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val networkModule = module {
    single <Retrofit> {
        Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com/")
            .build()
    }
}

val favsModule = module {

    single<CatsApi>{
        val retrofit: Retrofit = get()
        retrofit.create(CatsApi::class.java)
    }

    single<CatsRepository> {
        CatsRepositoryImpl(catsApi = get())
    }

    viewModel {
        FavsViewModel(catsRepos = get())
    }
}