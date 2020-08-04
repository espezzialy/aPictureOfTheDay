package com.espezzialy.apod

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.ViewModel
import com.espezzialy.apod.data.remote.model.ApodRequest
import com.espezzialy.apod.data.repository.ApodRepository
import com.espezzialy.apod.domain.models.Apod
import com.espezzialy.apod.domain.response.ApodBodyResponse
import com.espezzialy.apod.feature.apod.ApodMainViewModel
import com.google.gson.annotations.SerializedName
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class ApodMainViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val apodRepository = mockk<ApodRepository>()

    private val apodBodyResponse =  ApodBodyResponse(
         date  = "today",
         explanation = "test explanation",
         title = "title test",
         url = "url test"
    )

    @Test
    fun `when viewmodel get data then it should call the repository`() = runBlockingTest {

        //GIVEN
        val viewModel = instantiateViewModel()
        coEvery { apodRepository.getApod(ApodRequest()) } returns
                apodBodyResponse
        val apod = Apod(
            date = "today",
            explanation = "test explanation",
            title = "title test",
            url = "url test")
        //WHEN
        viewModel.getData()
        //THEN
        viewModel.apod.observeForever {
        assertEquals(it, apod)
        }

    }

    private fun instantiateViewModel(): ApodMainViewModel {
        return ApodMainViewModel(apodRepository)
    }
}