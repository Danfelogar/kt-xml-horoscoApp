package app.vercel.danfelogarPorfolios.horoscoapp.domain

import app.vercel.danfelogarPorfolios.horoscoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}