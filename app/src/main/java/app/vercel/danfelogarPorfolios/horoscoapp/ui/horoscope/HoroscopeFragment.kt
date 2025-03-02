package app.vercel.danfelogarPorfolios.horoscoapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.vercel.danfelogarPorfolios.horoscoapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {
    //when you defined var that start with "_" is because you don't access from another class
    private var _binding: FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}