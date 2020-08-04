package com.espezzialy.apod.feature.apod

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.espezzialy.apod.R
import kotlinx.android.synthetic.main.apod_fragment.*
import kotlinx.android.synthetic.main.apod_fragment.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ApodMain: Fragment() {

    private val viewModel: ApodMainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.apod_fragment, container, false)
        view.nasa_picture_title.setOnClickListener  {
            findNavController().navigate(R.id.action_apodMain_to_apodDetails)
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
            nasa_picture_title.text = apodBodyResponse.title
            Glide.with(this).load(apodBodyResponse.url).into(nasa_picture_image)
        })
    }
}
