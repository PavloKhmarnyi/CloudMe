package com.example.cloudme.service.openWeather.model;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class City {

    private long id;

    private String name;

    private String country;

    private Coordinates coordinates;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
