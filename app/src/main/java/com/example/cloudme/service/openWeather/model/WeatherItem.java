package com.example.cloudme.service.openWeather.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class WeatherItem {

    @SerializedName("dt")
    private long dateTime;

    @SerializedName("dt_txt")
    private long DateTimeTxt;

    private City city;

    private Clouds clouds;

    private Coordinates coordinates;

    private Main main;

    private Rain rain;

    private Sys sys;

    private List<Weather> weatherList;

    private Wind wind;
}
