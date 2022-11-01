package com.hipaduck.launchyourlunch.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hipaduck.launchyourlunch.databinding.FragmentPodCreateBinding
import com.hipaduck.launchyourlunch.databinding.FragmentSettingsBinding
import com.hipaduck.launchyourlunch.ui.viewmodel.PodCreateViewModel
import com.hipaduck.launchyourlunch.ui.viewmodel.SettingsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingFragment : Fragment() {
    private var _binding: FragmentSettingsBinding? = null
    val binding get() = _binding!!
    private val viewModel by viewModels<SettingsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}