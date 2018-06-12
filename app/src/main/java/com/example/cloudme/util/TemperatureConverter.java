package com.example.cloudme.util;

/**
 * Created by Illya Havrulyk on 6/12/2018.
 */

public class TemperatureConverter{

    public static double convertTemperature(double kelvin){
        double celsium = kelvin - 273.5;

        return celsium;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
