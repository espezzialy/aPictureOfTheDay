package com.espezzialy.apod.data.di

import com.espezzialy.apod.data.repository.ApodRepository
import com.espezzialy.apod.data.repository.ApodRepositoryImpl
import com.espezzialy.apod.feature.apod.ApodMainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val apodModule = module {
    factory {
        ApodRepositoryImpl()
    } bind ApodRepository::class

    viewModel {
        ApodMainViewModel(
            get()
        )
    }
}