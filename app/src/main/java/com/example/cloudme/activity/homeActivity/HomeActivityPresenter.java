package com.example.cloudme.activity.homeActivity;

import com.example.cloudme.service.google.api.GoogleDataApi;
import com.example.cloudme.service.google.api.GoogleDataService;
import com.example.cloudme.service.google.model.GoogleData;
import com.example.cloudme.service.google.model.Location;
import com.example.cloudme.service.openWeather.api.OpenWeatherApi;
import com.example.cloudme.service.openWeather.api.OpenWeatherService;
import com.example.cloudme.service.openWeather.model.WeatherData;
import com.example.cloudme.service.openWeather.model.WeatherDataTransfer;

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

    private OpenWeatherService openWeatherService;
    private OpenWeatherApi openWeatherApi;

    private WeatherDataTransfer weatherDataTransfer;

    public HomeActivityPresenter(IHomeView view) {
        this.view = view;
        googleDataService =  GoogleDataService.getInstance();
        googleDataApi = googleDataService.getGoogleDataApi();

        openWeatherService = OpenWeatherService.getInstance();
        openWeatherApi = openWeatherService.getOpenWeatherApi();


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
                    view.setLocation(location);
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
    public void fetchWeatherFromOpenWeather(double lat, double lon, String appid) {
        view.showHomeActivityProgressBar();
        openWeatherApi.fetchWeatherData(lat,lon,appid).enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                view.hideHomeActivityProgressBar();
                if (response.errorBody() == null &&
                        response.raw().code() == 200 &&
                        response.body().getCod() == 200) {

                    WeatherData weatherData = response.body();
                    weatherData.getWeatherItems();
                    view.enableSearchCityButton();
                    view.enableSearchWeatherButton();
                    //TODO: create instance and set weather data
                    weatherDataTransfer = WeatherDataTransfer.getInstance();
                    weatherDataTransfer.setWeatherData(weatherData);

                } else {
                    view.disableSearchCityButton();
                    view.showErrorMessage(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                int a = 2;
            }
        });
    }
}
