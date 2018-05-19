package com.example.cloudme.service.openWeather.model;

import java.util.List;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class WeatherData {

    private int cod;

    private List<WeatherItem> weatherItem;

    private  City city;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public List<WeatherItem> getWeatherItem() {
        return weatherItem;
    }

    public void setWeatherItem(List<WeatherItem> weatherItem) {
        this.weatherItem = weatherItem;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
