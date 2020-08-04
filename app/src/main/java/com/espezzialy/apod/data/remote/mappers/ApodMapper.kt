package com.espezzialy.apod.data.remote.mappers

import com.espezzialy.apod.domain.models.Apod
import com.espezzialy.apod.domain.response.ApodBodyResponse

object ApodMapper {
    fun toApodDomain(apodResponse: ApodBodyResponse) = Apod(
        date = apodResponse.date ?:"" ,
        explanation = apodResponse.explanation ?:"",
        title = apodResponse.title ?:"",
        url = apodResponse.url ?:""
    )

}