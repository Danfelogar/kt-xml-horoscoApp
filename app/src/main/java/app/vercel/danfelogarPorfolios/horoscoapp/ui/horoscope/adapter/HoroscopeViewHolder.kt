package app.vercel.danfelogarPorfolios.horoscoapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import app.vercel.danfelogarPorfolios.horoscoapp.databinding.ItemHoroscopeBinding
import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscope.text = binding.tvHoroscope.context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope) {
                onItemSelected(horoscopeInfo)
            }
        }
    }

    fun startRotationAnimation(view:View, newLambda: () -> Unit) {
        view.animate().apply {
            duration = 380
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLambda() }
            start()
        }
    }
}