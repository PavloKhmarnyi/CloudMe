package com.example.cloudme.activity.homeActivity;

import com.example.cloudme.service.google.model.Location;

/**
 * Created by Illya Havrulyk on 5/5/2018.
 */

public interface IHomeView {
    void showErrorMessage(String message);
    void hideErrorMessage();
    void showCityNotFoundErrorMessage();
    void showWeatherNotFoundErrorMessage();
    void showFieldIsEmptyErrorMessage();
    void showSuccessMessage(String message);
    void hideSuccessMessage();
    void showHomeActivityProgressBar();
    void hideHomeActivityProgressBar();
    void enableSearchCityButton();
    void disableSearchCityButton();
    void enableSearchWeatherButton();
    void disableSearchWeatherButton();
    boolean isFieldEmpty();
    Location getLocation();
    void setLocation(Location location);
    void startNewActivity();
    void showCheckImageView();
    void hideCheckImageView();
    void showErrorImageView();
    void hideErrorImageView();
}
