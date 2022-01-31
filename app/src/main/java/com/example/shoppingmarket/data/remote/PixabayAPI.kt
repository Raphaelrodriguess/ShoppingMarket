package com.example.shoppingmarket.data.remote

import com.example.shoppingmarket.data.remote.responses.ImageResponse
import com.example.shoppingmarket.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayAPI {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = Constants.API_KEY
    ): Response<ImageResponse>
}