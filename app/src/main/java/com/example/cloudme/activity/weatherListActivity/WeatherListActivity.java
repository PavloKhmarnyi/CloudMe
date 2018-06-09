package com.example.cloudme.activity.weatherListActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.cloudme.cloudme.R;

public class WeatherListActivity extends AppCompatActivity {
    private RecyclerView weatherItemsRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        weatherItemsRecyclerView = findViewById(R.id.weatherItemsRecyclerView);
    }
}
