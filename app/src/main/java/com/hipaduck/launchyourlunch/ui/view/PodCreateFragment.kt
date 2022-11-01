package com.hipaduck.launchyourlunch.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hipaduck.launchyourlunch.databinding.FragmentPodCreateBinding
import com.hipaduck.launchyourlunch.ui.viewmodel.PodCreateViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PodCreateFragment : Fragment() {
    private var _binding: FragmentPodCreateBinding? = null
    val binding get() = _binding!!
    private val viewModel by viewModels<PodCreateViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPodCreateBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}