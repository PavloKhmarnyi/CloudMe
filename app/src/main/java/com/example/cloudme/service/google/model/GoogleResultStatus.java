package com.example.cloudme.service.google.model;

/**
 * Created by pavlo on 5/12/2018.
 */

public enum GoogleResultStatus {
    OK("OK"),
    OVER_QUERY_LIMIT("OVER_QUERY_LIMIT");

    private final String statusName;

    GoogleResultStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
