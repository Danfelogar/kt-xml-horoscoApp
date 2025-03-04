package app.vercel.danfelogarPorfolios.horoscoapp.ui.detail

import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading: HoroscopeDetailState()
    data class Error(val error:String): HoroscopeDetailState()
    data class Success(val data:String, val sign: String, val horoscopeModel: HoroscopeModel): HoroscopeDetailState()
}