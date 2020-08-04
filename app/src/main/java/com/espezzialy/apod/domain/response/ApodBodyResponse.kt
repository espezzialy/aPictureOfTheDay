package com.espezzialy.apod.domain.response

import com.google.gson.annotations.SerializedName

data class ApodBodyResponse (
    @SerializedName("date")
    val date: String?,
    @SerializedName("explanation")
    val explanation: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?
)