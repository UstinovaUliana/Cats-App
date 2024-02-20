package com.example.catimagesapp.data

class CatsResponse (
    val id: String? = null,
    val url: String? = null,
    val width:Int? = null,
    val height: Int? = null,
    val breeds: Breed? = null
        )
class Breed (
    val id: String? = null,
    val name: String? = null,
    val temperament: String? = null,
    val origin: String? = null,
    val lifeSpan: String? = null,
    val wikipediaUrl: String? = null,
        )