package com.example.cloudme.service.google.api;


import com.example.cloudme.service.google.model.GoogleData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pavlo on 5/12/2018.
 */

public interface GoogleDataApi {
    @GET("/json")
    Call<GoogleData> fetchGoogleData(@Query("address") String address);
}
