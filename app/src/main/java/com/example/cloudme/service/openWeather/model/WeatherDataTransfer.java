package com.example.cloudme.service.openWeather.model;

/**
 * Created by Illya Havrulyk on 6/8/2018.
 */

public class WeatherDataTransfer {

    private static WeatherDataTransfer INSTANCE;
    private WeatherData weatherData;

    // Private constructor prevents diractly initializing new instance of class
    private WeatherDataTransfer () {

    }

    // Initialization or return initialized instance
    public static WeatherDataTransfer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WeatherDataTransfer ();
        }

        return INSTANCE;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
}
