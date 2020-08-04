package com.espezzialy.apod.data.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.espezzialy.apod.data.remote.model.ApodRequest
import com.espezzialy.apod.data.remote.service.ApodServices
import com.espezzialy.apod.domain.models.Apod
import com.espezzialy.apod.domain.response.ApodBodyResponse
import com.espezzialy.apod.feature.apod.ApodMainViewModel
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class ApodRepositoryImplTest {

    private lateinit var apodRepositoryImpl : ApodRepositoryImpl
    private val apodServices : ApodServices = mockk()
    private val apodRequest : ApodRequest = mockk()
    private val apodBodyResponse : ApodBodyResponse = mockk()



    @Test
    fun `shouldReturnApodBodyResponse_whenServiceWasCalledSuccessfully`(){
        coEvery {
            apodRepositoryImpl.getApod(apodRequest) } returns
                apodBodyResponse
        //when

    }

}

//GIVEN
//WHEN
//THEN