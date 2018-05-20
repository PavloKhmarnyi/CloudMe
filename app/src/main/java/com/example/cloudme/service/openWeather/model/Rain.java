package com.example.cloudme.service.openWeather.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class Rain {

    /** Precipitation volume for last 3 hours */
    @SerializedName("3h")
    private double lastThreeHours;

    public double getLastThreeHours() {
        return lastThreeHours;
    }

    public void setLastThreeHours(double lastThreeHours) {
        this.lastThreeHours = lastThreeHours;
    }
}
