package com.espezzialy.apod.feature.splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.espezzialy.apod.R


class SplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_apodMain)},
        2000)

        return inflater.inflate(R.layout.splash_fragment, container, false);

    }
}

