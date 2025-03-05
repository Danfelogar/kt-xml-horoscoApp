package app.vercel.danfelogarPorfolios.horoscoapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.HoroscopeModel
import app.vercel.danfelogarPorfolios.horoscoapp.domain.usecase.GetPrediction
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPrediction: GetPrediction): ViewModel() {

    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading)
    val state: StateFlow<HoroscopeDetailState> = _state

    lateinit var horoscope: HoroscopeModel

    fun getHoroscope(sign: HoroscopeModel) {
        horoscope = sign
        viewModelScope.launch {
            _state.value = HoroscopeDetailState.Loading
            val result = withContext(Dispatchers.IO) { getPrediction(sign.name) }// secondary thread
            if(result != null) {
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign, horoscope)
            }else {
                _state.value = HoroscopeDetailState.Error("An error has occurred, please try again later.")
            }
        }
    }
}