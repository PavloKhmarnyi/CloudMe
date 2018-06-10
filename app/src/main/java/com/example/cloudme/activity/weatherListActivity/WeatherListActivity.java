package com.example.cloudme.activity.weatherListActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cloudme.adapter.WeatherAdapter;
import com.example.cloudme.cloudme.R;
import com.example.cloudme.service.openWeather.model.WeatherData;
import com.example.cloudme.service.openWeather.model.WeatherDataTransfer;

public class WeatherListActivity extends AppCompatActivity {
    private RecyclerView weatherItemsRecyclerView;

    private WeatherAdapter adapter;
    private WeatherDataTransfer weatherDataTransfer;
    private WeatherData weatherData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_list_acivity);
        weatherItemsRecyclerView = findViewById(R.id.weatherItemsRecyclerView);
        weatherItemsRecyclerView.setLayoutManager(new LinearLayoutManager(WeatherListActivity.this));
        weatherDataTransfer = WeatherDataTransfer.getInstance();
        weatherData = weatherDataTransfer.getWeatherData();
        adapter = new WeatherAdapter(this, weatherData.getWeatherItems());
        weatherItemsRecyclerView.setAdapter(adapter);
    }
}
