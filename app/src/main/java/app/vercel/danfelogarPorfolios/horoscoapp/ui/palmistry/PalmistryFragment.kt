package app.vercel.danfelogarPorfolios.horoscoapp.ui.palmistry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.vercel.danfelogarPorfolios.horoscoapp.databinding.FragmentPalistryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalmistryFragment : Fragment() {
    //when you defined var that start with "_" is because you don't access from another class
    private var _binding: FragmentPalistryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPalistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}