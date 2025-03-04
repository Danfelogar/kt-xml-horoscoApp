package app.vercel.danfelogarPorfolios.horoscoapp.ui.horoscope

import androidx.lifecycle.ViewModel
import app.vercel.danfelogarPorfolios.horoscoapp.data.providers.HoroscopeProvider
import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

//inject for inject everything this thank you for dagger hilt
@HiltViewModel
class HoroscopeViewModel @Inject constructor(
    horoscopeProvider: HoroscopeProvider
): ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<HoroscopeInfo>> = _horoscope

    init{
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }

}