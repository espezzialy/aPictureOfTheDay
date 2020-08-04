package com.espezzialy.apod.feature.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.espezzialy.apod.core.extensions.asLiveData
import com.espezzialy.apod.data.remote.mappers.ApodMapper
import com.espezzialy.apod.data.remote.model.ApodRequest
import com.espezzialy.apod.data.repository.ApodRepository
import com.espezzialy.apod.domain.models.Apod
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
//
//class ApodDetailsViewModel (val apodRepository: ApodRepository) : ViewModel() {
//
//    val _details = MutableLiveData<Apod>()
//    val details = _details.asLiveData()
//
//    fun getData(){
//        CoroutineScope(Dispatchers.IO).launch {
//            val response = apodRepository.getApod(
//                ApodRequest()
//            )
//            val responseMapper = ApodMapper.toApodDomain(response)
//            _details.postValue(responseMapper)
//
//        }
//
//    }
//
//}
