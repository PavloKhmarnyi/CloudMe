package com.example.cloudme.activity.homeActivity;

/**
 * Created by Illya Havrulyk on 5/5/2018.
 */

public interface IHomeView {
    void showErrorMessage();
    void hideErrorMessage();
    void hideSuccessMessage();
    void showSuccessMessage();
    void showUserLoadingProgressBar();
    void hideUserLoadingProgressBar();
    void enableSearchCityButton();
    void disableSearchCityButton();
    void isFieldsEmpty();
    void isCityFound();
    void isWeatherFound();
}
