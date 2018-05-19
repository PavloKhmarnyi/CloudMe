package com.example.cloudme.service.openWeather.model;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class Sys {
    public char getPod() {
        return pod;
    }

    public void setPod(char pod) {
        this.pod = pod;
    }

    private char pod;//In json respond there was0pod: 'd'
}
