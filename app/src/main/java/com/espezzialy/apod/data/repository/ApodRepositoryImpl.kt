package com.espezzialy.apod.data.repository

import com.espezzialy.apod.data.remote.model.ApodRequest
import com.espezzialy.apod.data.remote.service.ApiService.service
import com.espezzialy.apod.domain.response.ApodBodyResponse


class ApodRepositoryImpl: ApodRepository {
    override suspend fun getApod(apodRequest: ApodRequest): ApodBodyResponse {
        return service.getData (
            apiKey = apodRequest.apiKey,
            date = apodRequest.date,
            hd = apodRequest.hd
        )
    }
}