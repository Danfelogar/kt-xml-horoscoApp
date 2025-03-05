package app.vercel.danfelogarPorfolios.horoscoapp.domain.usecase

import app.vercel.danfelogarPorfolios.horoscoapp.domain.Repository
import javax.inject.Inject

class GetPrediction @Inject constructor(private val repository: Repository) {
    //operator allow overwrite someones class or methods, you don't need instanced only use GetPrediction() for invoke fun
    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}
