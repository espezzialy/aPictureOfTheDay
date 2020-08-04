package com.espezzialy.apod.domain.models

data class Apod (
    val date: String,
    val explanation: String,
    val title: String,
    val url: String
)