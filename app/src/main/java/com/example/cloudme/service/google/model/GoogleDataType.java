package com.example.cloudme.service.google.model;

/**
 * Created by pavlo on 5/12/2018.
 */

public enum GoogleDataType {
    LOCALITY("locality"),
    POLITICAL("political"),
    ADMINISTRATIVE_AREA_LEVEL3("administrative_area_level_3"),
    ADMINISTRATIVE_AREA_LEVEL1("administrative_area_level_1"),
    COUNTRY("country"),
    POSTAL_CODE("postal_code");

    private final String name;

    GoogleDataType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
