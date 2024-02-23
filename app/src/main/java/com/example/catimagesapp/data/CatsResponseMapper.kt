package com.example.catimagesapp.data

import com.example.catimagesapp.domain.cats.model.Cat

object CatsResponseMapper {
    fun CatsResponse.toCats(): List<Cat> {
        return images.map{
            Cat(
                it.id.orEmpty(),
                it.url.orEmpty()
            )
        }
    }
}