package com.espezzialy.apod.data.remote.service

import com.espezzialy.apod.domain.response.ApodBodyResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Query

interface ApodServices {
    @GET("planetary/apod")
    suspend fun getData(
        @Query("api_key") apiKey: String = "DjUqV3JPD3Ps6MHQGYla3zoSLUzuTUnmEDgOZJx4",
        @Query("date") date: String = "2020-07-02",
        @Query("hd") hd: Boolean = false

    ): ApodBodyResponse
}