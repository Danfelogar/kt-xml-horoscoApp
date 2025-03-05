package app.vercel.danfelogarPorfolios.horoscoapp.data

import android.util.Log
import app.vercel.danfelogarPorfolios.horoscoapp.data.network.HoroscopeApiService
import app.vercel.danfelogarPorfolios.horoscoapp.domain.Repository
import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.PredictionModel
import javax.inject.Inject

//repository Implementation
class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository  {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        //call retrofit
        runCatching { apiService.getHoroscope((sign)) }
            .onSuccess { return it?.toDomain() }
            .onFailure { Log.i("Danfelogar Dev", "An error has occurred: ${it.message}") }
        return null
    }

}