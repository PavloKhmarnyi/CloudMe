package com.example.cloudme.service.openWeather.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class Rain {

    @SerializedName("3h")
    private double lastThreeHours;//Precipitation volume for last 3 hours

    public double getLastThreeHours() {
        return lastThreeHours;
    }

    public void setLastThreeHours(double lastThreeHours) {
        this.lastThreeHours = lastThreeHours;
    }
}
