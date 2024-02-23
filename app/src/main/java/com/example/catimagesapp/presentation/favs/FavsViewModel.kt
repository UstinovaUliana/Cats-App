package com.example.catimagesapp.presentation.favs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.catimagesapp.domain.cats.model.Cat
import com.example.catimagesapp.domain.cats.model.CatsRequest
import com.example.catimagesapp.domain.repository.CatsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.dsl.module

class FavsViewModel(catsRepos: CatsRepository) : ViewModel()  {

    private val _items = MutableLiveData<List<Cat>>()
    val items: LiveData<List<Cat>> get() = _items

    init{
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val cats = catsRepos.getCats(CatsRequest(10))
                _items.postValue(cats)
            }
        }
    }

}




