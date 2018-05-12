package com.example.cloudme.service.google.api;

import com.example.cloudme.service.Config;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pavlo on 5/12/2018.
 */

public class GoogleDataService {
    private static GoogleDataService INSTANCE;
    public static final OkHttpClient CLIENT = new OkHttpClient();

    private GoogleDataApi googleDataApi;

    private GoogleDataService() {
        googleDataApi = initGoogleDataApi();
    }

    public static GoogleDataService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GoogleDataService();
        }

        return INSTANCE;
    }

    public GoogleDataApi getGoogleDataApi() {
        return googleDataApi;
    }

    private static GoogleDataApi initGoogleDataApi() {
        return getRetrofit().create(GoogleDataApi.class);
    }

    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Config.GOOGLE_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(CLIENT)
                .build();
    }
}
