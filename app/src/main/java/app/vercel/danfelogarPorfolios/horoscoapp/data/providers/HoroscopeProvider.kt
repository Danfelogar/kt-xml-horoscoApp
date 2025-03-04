package app.vercel.danfelogarPorfolios.horoscoapp.data.providers

import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.HoroscopeInfo.*
import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.HoroscopeInfo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces,
        )
    }
}