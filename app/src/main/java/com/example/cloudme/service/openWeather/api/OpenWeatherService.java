package com.example.cloudme.service.openWeather.api;

import com.example.cloudme.service.Config;
import com.example.cloudme.service.google.api.GoogleDataApi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Illya Havrulyk on 5/19/2018.
 */

public class OpenWeatherService {
    private static OpenWeatherService INSTANCE;
    public static final OkHttpClient CLIENT = new OkHttpClient();

    private OpenWeatherApi openWeatherApi;

    public static OpenWeatherService getInstance(){
        if (INSTANCE == null){
            INSTANCE = new OpenWeatherService();
        }

        return INSTANCE;
    }

    private OpenWeatherService(){
        openWeatherApi = initOpenWeatherApi();
    }

    public OpenWeatherApi getOpenWeatherApi(){
        return openWeatherApi;
    }

    private static OpenWeatherApi initOpenWeatherApi(){
        return  getRetrofit().create(OpenWeatherApi.class);
    }

    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Config.OPENWEATHER_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(CLIENT)
                .build();
    }
}
