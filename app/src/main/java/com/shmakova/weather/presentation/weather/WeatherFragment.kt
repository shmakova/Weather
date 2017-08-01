package com.shmakova.weather.presentation.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shmakova.weather.R
import com.shmakova.weather.presentation.base.BaseFragment
import com.shmakova.weather.presentation.commons.inflate

import kotlinx.android.synthetic.main.fragment_weather.*

class WeatherFragment : BaseFragment() {

    private val temperatureTextView by lazy {
        temperature_text_view
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_weather)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        temperatureTextView.setText(R.string.app_name)
    }
}
