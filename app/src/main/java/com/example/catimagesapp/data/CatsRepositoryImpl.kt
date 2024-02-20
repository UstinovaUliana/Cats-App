package com.example.catimagesapp.data

import com.example.catimagesapp.domain.cats.model.Cat
import com.example.catimagesapp.domain.cats.model.CatsRequest
import com.example.catimagesapp.domain.repository.CatsRepository

class CatsRepositoryImpl(catsApi: CatsApi): CatsRepository {

    override suspend fun getCats(catsRequest: CatsRequest): List<Cat> {
        return catsApi.getCats(CatsRequest.limit).toCats()
    }

}