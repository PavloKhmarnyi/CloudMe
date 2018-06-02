package com.example.cloudme.activity.homeActivity;

import com.example.cloudme.service.google.api.GoogleDataApi;
import com.example.cloudme.service.google.api.GoogleDataService;
import com.example.cloudme.service.google.model.GoogleData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Illya Havrulyk on 5/12/2018.
 */

public class HomeActivityPresenter implements IHomePresenter {

    private IHomeView view;

    private GoogleDataService googleDataService;

    private GoogleDataApi googleDataApi;

    public HomeActivityPresenter(IHomeView view) {
        this.view = view;
        googleDataService =  GoogleDataService.getInstance();
        googleDataApi = googleDataService.getGoogleDataApi();
    }

    @Override
    public boolean isFieldEmpty(String cityName) {
        return false;
    }

    @Override
    public void fetchCoordinatesFromGoogle(String cityName) {
        view.showUserLoadingProgressBar();
        googleDataApi.fetchGoogleData(cityName).enqueue(new Callback<GoogleData>() {
            @Override
            public void onResponse(Call<GoogleData> call, Response<GoogleData> response) {
                view.enableSearchCityButton();
                view.hideUserLoadingProgressBar();
                view.showSuccessMessage();
            }

            @Override
            public void onFailure(Call<GoogleData> call, Throwable t) {
                view.hideUserLoadingProgressBar();
                view.showErrorMessage();
                view.disableSearchCityButton();
            }
        });
    }

    @Override
    public void fetchWeatherFromOpenWeather(long lat, long lon) {

    }
}
