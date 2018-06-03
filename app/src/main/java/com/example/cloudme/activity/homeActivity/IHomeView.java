package com.example.cloudme.activity.homeActivity;

/**
 * Created by Illya Havrulyk on 5/5/2018.
 */

public interface IHomeView {
    void showErrorMessage(String message);
    void hideErrorMessage();
    void showCityNotFoundErrorMessage();
    void hideCityNotFoundErrorMessage();
    void showWeatherNotFoundErrorMessage();
    void hideWeatherNotFoundErrorMessage();
    void showFieldIsEmptyErrorMessage();
    void hideFieldIsEmptyErrorMessage();
    void showSuccessMessage(String message);
    void hideSuccessMessage();
    void showHomeActivityProgressBar();
    void hideHomeActivityProgressBar();
    void enableSearchCityButton();
    void disableSearchCityButton();
    void enableSearchWeatherButton();
    void disableSearchWeatherButton();
    boolean isFieldEmpty();
}
