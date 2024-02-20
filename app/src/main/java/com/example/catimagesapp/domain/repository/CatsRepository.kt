package com.example.catimagesapp.domain.repository

import com.example.catimagesapp.domain.cats.model.Cat
import com.example.catimagesapp.domain.cats.model.CatsRequest

interface CatsRepository {
    suspend fun getCats(catsRequest: CatsRequest): List<Cat>
}