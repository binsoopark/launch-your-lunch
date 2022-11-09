package com.hipaduck.launchyourlunch.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class PodCreateViewModel : ViewModel() {
    private val _userName = MutableLiveData<String>()
    private val userName: MutableLiveData<String> get() = _userName
    init {

    }
}