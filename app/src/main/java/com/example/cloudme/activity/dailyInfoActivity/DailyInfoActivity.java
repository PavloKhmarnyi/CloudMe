package com.example.cloudme.activity.dailyInfoActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cloudme.cloudme.R;

/**
 * Created by ITHouseUser4 on 4/28/2018.
 */

public class DailyInfoActivity extends AppCompatActivity {

    private TextView cityTextView;
    private TextView dateTextView;
    private TextView timeTextView;
    private TextView temperatureTextView;
    private TextView humidityTextView;
    private TextView preassureTextView;
    private ImageView cloudinaryImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_info);

        cityTextView = findViewById(R.id.cityTextView);
        dateTextView = findViewById(R.id.dateTextView);
        timeTextView = findViewById(R.id.timeTextView);
        temperatureTextView = findViewById(R.id.temperatureTextView);
        humidityTextView = findViewById(R.id.humidityTextView);
        preassureTextView = findViewById(R.id.preassureTextView);
        cloudinaryImageView = findViewById(R.id.cloudinaryImageView);
    }
}
