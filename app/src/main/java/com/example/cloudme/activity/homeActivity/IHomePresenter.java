package com.example.cloudme.activity.homeActivity;

/**
 * Created by Illya Havrulyk on 5/12/2018.
 */

public interface IHomePresenter {
     boolean isFieldEmpty(String cityName);
     void fetchCoordinatesFromGoogle (String cityName);
     void fetchWeatherFromOpenWeather (long lat, long lon);



}
