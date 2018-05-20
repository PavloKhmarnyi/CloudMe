package com.example.cloudme.service.openWeather.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class Main {

    private int temp;

    @SerializedName("temp_min")
    private int tempMin;

    @SerializedName("temp_max")
    private int tempMax;

    private int pressure;

    @SerializedName("sea_level")
    private int seaLevel;

    /**
     * Atmospheric pressure on the ground level, hPa
     */
    @SerializedName("grnd_level")
    private int grndLevel;

    private int humidity;

    /**
     * Internal parameter
     */
    @SerializedName("temp_kf")
    private int tempKf;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(int seaLevel) {
        this.seaLevel = seaLevel;
    }

    public int getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(int grndLevel) {
        this.grndLevel = grndLevel;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTempKf() {
        return tempKf;
    }

    public void setTempKf(int tempKf) {
        this.tempKf = tempKf;
    }
}
