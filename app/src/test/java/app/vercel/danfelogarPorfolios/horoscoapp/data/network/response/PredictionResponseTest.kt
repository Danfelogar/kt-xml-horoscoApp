package app.vercel.danfelogarPorfolios.horoscoapp.data.network.response

import app.vercel.danfelogarPorfolios.horoscoapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PredictionResponseTest{

    @Test
    fun `toDomain should return a correct PredictionModel`(){
        //Give
        val horoscopeResponse = anyResponse

        //When
        val predictionModel = horoscopeResponse.toDomain()
        //Them

        predictionModel.sign shouldBe  horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}