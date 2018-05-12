package com.example.cloudme.service.google.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavlo on 5/12/2018.
 */

public class Location {
    @SerializedName("lat")
    private long latitude;

    @SerializedName("lng")
    private long longitude;

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
