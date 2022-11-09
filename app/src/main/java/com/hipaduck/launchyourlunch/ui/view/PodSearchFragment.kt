package com.hipaduck.launchyourlunch.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hipaduck.launchyourlunch.databinding.FragmentPodSearchBinding
import com.hipaduck.launchyourlunch.ui.viewmodel.PodSearchViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PodSearchFragment : Fragment() {
    private var _binding: FragmentPodSearchBinding? = null
    val binding get() = _binding!!
    private val viewModel by viewModels<PodSearchViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPodSearchBinding.inflate(layoutInflater)
//        binding
//        viewModel.getWeather()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}