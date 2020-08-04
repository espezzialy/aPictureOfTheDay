package com.espezzialy.apod.feature.apod

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.espezzialy.apod.core.extensions.asLiveData
import com.espezzialy.apod.data.remote.mappers.ApodMapper
import com.espezzialy.apod.data.remote.model.ApodRequest
import com.espezzialy.apod.data.repository.ApodRepository
import com.espezzialy.apod.data.repository.ApodRepositoryImpl
import com.espezzialy.apod.domain.models.Apod
import com.espezzialy.apod.domain.response.ApodBodyResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class ApodMainViewModel (val apodRepository: ApodRepository) : ViewModel() {

    val _apod = MutableLiveData<Apod>()
    val apod = _apod.asLiveData()

    fun getData(){
        CoroutineScope(Dispatchers.IO).launch {
            val response = apodRepository.getApod(
                ApodRequest()
            )
            val responseMapper = ApodMapper.toApodDomain(response)
            _apod.postValue(responseMapper)

        }

    }

}
