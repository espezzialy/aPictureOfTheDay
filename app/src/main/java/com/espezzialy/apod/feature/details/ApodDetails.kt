package com.espezzialy.apod.feature.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.espezzialy.apod.R
import com.espezzialy.apod.feature.apod.ApodMainViewModel
import kotlinx.android.synthetic.main.apod_details.*
import kotlinx.android.synthetic.main.apod_details.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ApodDetails: Fragment() {

    private val viewModel: ApodMainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.apod_details, container, false)
        view.nasa_picture_name.setOnClickListener  {
            findNavController().navigate(R.id.action_apodDetails_to_apodMain)
        }
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        startObservables()
        viewModel.getData()


    }

    private fun startObservables() {
        viewModel.apod.observe(viewLifecycleOwner, Observer { apodBodyResponse ->
            nasa_picture_name.text = apodBodyResponse.title
            nasa_picture_details.text = apodBodyResponse.explanation
        })
    }
}




