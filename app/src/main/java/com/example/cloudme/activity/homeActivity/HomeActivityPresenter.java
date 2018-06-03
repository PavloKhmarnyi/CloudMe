package com.example.cloudme.activity.homeActivity;

/**
 * Created by Illya Havrulyk on 5/12/2018.
 */

public class HomeActivityPresenter implements IHomePresenter {

    private IHomeView view;

    public HomeActivityPresenter(IHomeView view) {
        this.view = view;
    }

    @Override
    public void fetchCoordinatesFromGoogle(String cityName) {

    }

    @Override
    public void fetchWeatherFromOpenWeather(long latitude, long longitude) {

    }
}
