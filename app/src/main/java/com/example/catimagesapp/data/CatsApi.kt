package com.example.catimagesapp.data

import com.example.catimagesapp.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface CatsApi {

    @GET("")
    suspend fun getCats(
        @Query("limit") limit: Int,
        @Query("api_key") apiKey: String? = BuildConfig.API_KEY
    ) : CatsResponse

}