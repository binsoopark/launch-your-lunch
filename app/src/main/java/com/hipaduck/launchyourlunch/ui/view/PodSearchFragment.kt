package com.hipaduck.launchyourlunch.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
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

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val resultObserver = Observer<String> {
            binding.searchFragmentResult.text = it
        }

        viewModel.weatherData.observe(viewLifecycleOwner, resultObserver)

        binding.searchFragmentTitle.setOnClickListener {
            viewModel.getWeather()
            Toast.makeText(context, "Called Again", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}