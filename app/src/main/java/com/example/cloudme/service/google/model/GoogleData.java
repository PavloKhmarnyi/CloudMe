package com.example.cloudme.service.google.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pavlo on 5/12/2018.
 */

public class GoogleData {
    @SerializedName("results")
    private List<Result> results;

    @SerializedName("status")
    private GoogleResultStatus status;

    @SerializedName("error_message")
    private String errorMessage;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public GoogleResultStatus getStatus() {
        return status;
    }

    public void setStatus(GoogleResultStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
