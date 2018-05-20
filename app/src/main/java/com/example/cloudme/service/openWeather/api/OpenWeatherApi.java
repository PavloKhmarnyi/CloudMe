package com.example.cloudme.service.openWeather.api;

import com.example.cloudme.service.openWeather.model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public interface OpenWeatherApi {
    @GET("/json")
    Call<WeatherData> fetchWeatherData(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String appid);
}
