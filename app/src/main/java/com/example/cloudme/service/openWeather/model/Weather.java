package com.example.cloudme.service.openWeather.model;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class Weather {

    private int id;

    /** Group of weather parameters (Rain, Snow, Extreme etc.) */
    private String main;

    private String description;

    /** Weather icon id */
    private char icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }
}
