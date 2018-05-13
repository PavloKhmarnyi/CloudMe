package com.example.cloudme.service.google.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavlo on 5/12/2018.
 */

public class Geometry {
    @SerializedName("location")
    private Location location;

    @SerializedName("place_id")
    private String placeId;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
}
