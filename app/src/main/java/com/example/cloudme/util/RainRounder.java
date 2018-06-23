package com.example.cloudme.util;

/**
 * Created by ITHouseUser1 on 6/23/2018.
 */

public class RainRounder {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        double factor = Math.pow(10, places);
        value = value * factor;
        double round = Math.round(value);
        return round / factor;
    }
}
