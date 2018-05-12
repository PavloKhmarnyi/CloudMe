package com.example.cloudme.activity.homeActivity;

/**
 * Created by Illya Havrulyk on 5/12/2018.
 */

public class HomeActivityPresenter implements IHomePresenter {

    private HomeActivityView view;

    public HomeActivityPresenter(HomeActivityView view) {
        this.view = view;
    }

    @Override
    public boolean isFieldEmpty(String cityName) {
        return false;
    }

    @Override
    public void fetchCoordinatesFromGoogle(String cityName) {

    }

    @Override
    public void fetchWeatherFromOpenWeather(long lat, long lon) {

    }
}
