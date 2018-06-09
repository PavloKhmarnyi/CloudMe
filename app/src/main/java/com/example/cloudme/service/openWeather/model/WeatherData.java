package com.example.cloudme.service.openWeather.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class WeatherData {

    private int cod;

    private String message;

    @SerializedName("list")
    private List<WeatherItem> weatherItems;

    private  City city;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<WeatherItem> getWeatherItems() {
        return weatherItems;
    }

    public void setWeatherItems(List<WeatherItem> weatherItems) {
        this.weatherItems = weatherItems;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
