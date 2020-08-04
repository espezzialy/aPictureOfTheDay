package com.espezzialy.apod

import android.app.Application
import com.espezzialy.apod.data.di.apodModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ApodApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@ApodApp)

            modules(apodModule)
        }
    }
}