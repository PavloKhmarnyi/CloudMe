package com.example.cloudme.service.openWeather.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class WeatherItem {

    @SerializedName("dt")
    private String dateTime;

    @SerializedName("dt_txt")
    private String DateTimeTxt;

    private Main main;

    private List<Weather> weatherList;

    private Clouds clouds;

    private Wind wind;

    private Rain rain;

    private Sys sys;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTimeTxt() {
        return DateTimeTxt;
    }

    public void setDateTimeTxt(String dateTimeTxt) {
        DateTimeTxt = dateTimeTxt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }
}
