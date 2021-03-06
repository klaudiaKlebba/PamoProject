package com.example.pamoproject.Utilities

import com.example.pamoproject.POJO.ModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {

    @GET("weather")//przekazanie tych 3 rzeczy
    fun getCurrentWeatherData(
        @Query("lat") latitude:String,
        @Query("lon") longitude:String,
        @Query("APPID") api_key:String,
    ):Call<ModelClass>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") cityName:String,
        @Query("APPID") api_key:String,
    ):Call<ModelClass>
}