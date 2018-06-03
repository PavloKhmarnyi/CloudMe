package com.example.cloudme.service.google.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavlo on 5/12/2018.
 */

public class Location {
    @SerializedName("lat")
    private double latitude;

    @SerializedName("lng")
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
