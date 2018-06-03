package com.example.cloudme.activity.homeActivity;

import com.example.cloudme.service.google.api.GoogleDataApi;
import com.example.cloudme.service.google.api.GoogleDataService;
import com.example.cloudme.service.google.model.GoogleData;
import com.example.cloudme.service.google.model.Location;

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
    public void fetchCoordinatesFromGoogle(String cityName) {
        view.showHomeActivityProgressBar();
        googleDataApi.fetchGoogleData(cityName).enqueue(new Callback<GoogleData>() {
            @Override
            public void onResponse(Call<GoogleData> call, Response<GoogleData> response) {
                view.hideHomeActivityProgressBar();
                if (response.errorBody() == null &&
                        response.raw().code() == 200 &&
                        response.body().getStatus().getStatusName().equals("OK")) {

                    GoogleData googleData = response.body();
                    Location location = googleData.getResults().get(0).getGeometry().getLocation();
                    String address = googleData.getResults().get(0).getFormattedAddress();

                    view.enableSearchCityButton();
                    view.enableSearchWeatherButton();
                    view.showSuccessMessage(address);
                } else {
                    view.disableSearchCityButton();
                    view.showErrorMessage(response.body().getErrorMessage());
                }
            }

            @Override
            public void onFailure(Call<GoogleData> call, Throwable t) {
                view.hideHomeActivityProgressBar();
                view.showCityNotFoundErrorMessage();
                view.disableSearchCityButton();
            }
        });
    }

    @Override
    public void fetchWeatherFromOpenWeather(long lat, long lon) {

    }
}
