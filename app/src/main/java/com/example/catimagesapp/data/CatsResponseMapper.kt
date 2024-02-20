package com.example.catimagesapp.data

import com.example.catimagesapp.domain.cats.model.Cat

object CatsResponseMapper {
    fun CatsResponse.toCats(): List<Cat> {
        val cats = ArrayList<Cat>()
        val id =  ""
        val imageId =  ""

        items?.get(0)?.let {
            cats.add(
                Cat(
                    id, imageId
                )
            )
            cats.add(
                Cat(
                    id, imageId
                )
            )
            cats.add(
                Cat(
                    id, imageId
                )
            )
            cats.add(
                Cat(
                    id, imageId
                )
            )
        }
        return cats
    }
}