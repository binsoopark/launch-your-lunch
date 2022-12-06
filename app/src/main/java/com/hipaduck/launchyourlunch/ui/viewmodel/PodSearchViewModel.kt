package com.hipaduck.launchyourlunch.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hipaduck.launchyourlunch.domain.GetWeather
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PodSearchViewModel @Inject constructor(
    private val getWeather: GetWeather
) : ViewModel() {
    private var _weatherData = MutableLiveData<String>()
    val weatherData: MutableLiveData<String> get() = _weatherData
    init {
        getWeather()
    }

    fun getWeather() {
        Log.d("GAEGUL", "getWeather: called")
        viewModelScope.launch(Dispatchers.Main) {
            val result: String = getWeather.invoke()
            _weatherData.value = result
            Log.d("GAEGUL", "getWeather: called result $result")
        }
    }
}