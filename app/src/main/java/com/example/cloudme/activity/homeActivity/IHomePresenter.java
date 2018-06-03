package com.example.cloudme.activity.homeActivity;

/**
 * Created by Illya Havrulyk on 5/12/2018.
 */

public interface IHomePresenter {
     void fetchCoordinatesFromGoogle (String cityName);
     void fetchWeatherFromOpenWeather (long latitude, long longitude);
}
