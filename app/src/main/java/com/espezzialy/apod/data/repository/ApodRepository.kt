package com.espezzialy.apod.data.repository

import com.espezzialy.apod.data.remote.model.ApodRequest
import com.espezzialy.apod.domain.response.ApodBodyResponse


interface ApodRepository {
   suspend fun getApod( apodRequest: ApodRequest): ApodBodyResponse
}