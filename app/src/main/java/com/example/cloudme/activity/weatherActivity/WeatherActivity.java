package com.example.cloudme.activity.weatherActivity;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cloudme.adapter.OnWeatherItemClickListener;
import com.example.cloudme.adapter.WeatherAdapter;
import com.example.cloudme.cloudme.R;

import java.util.ArrayList;

/**
 * Created by localhost on 5/5/2018.
 */

public class WeatherActivity extends AppCompatActivity {
    private RecyclerView weatherRecyclerView;
    private WeatherAdapter weatherAdapter;
    private ArrayList<String> weathersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        weatherRecyclerView = findViewById(R.id.weatherRecyclerView);
        weatherRecyclerView.setLayoutManager(new LinearLayoutManager(WeatherActivity.this));

        weatherAdapter = new WeatherAdapter(WeatherActivity.this, weathersList, new OnWeatherItemClickListener() {
            @Override
            public void onWeatherItemClick(String weatherItem) {

            }
        });

    }
}
