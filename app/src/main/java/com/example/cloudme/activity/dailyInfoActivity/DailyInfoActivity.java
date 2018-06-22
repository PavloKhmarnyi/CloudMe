package com.example.cloudme.activity.dailyInfoActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cloudme.cloudme.R;
import com.example.cloudme.util.TemperatureConverter;

import static com.example.cloudme.util.Utils.*;

public class DailyInfoActivity extends AppCompatActivity {
    private TextView cityTextView;
    private TextView dateTextView;
    private TextView timeTextView;
    private TextView temperatureTextView;
    private TextView humidityTextView;
    private TextView preassureTextView;
    private TextView windSpeedTextView;
    private ImageView cloudinaryImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_info);

        cityTextView = findViewById(R.id.cityTextView);
        dateTextView = findViewById(R.id.dateWeatherItemTextView);
        timeTextView = findViewById(R.id.timeTextView);
        temperatureTextView = findViewById(R.id.temperatureTextView);
        humidityTextView = findViewById(R.id.humidityWeatherItemTextView);
        preassureTextView = findViewById(R.id.pressureTextView);
        windSpeedTextView = findViewById(R.id.windSpeedTextView);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra(CITY_NAME);
        String weatherDate = intent.getStringExtra(WEATHER_DATE);

        double temperature = intent.getDoubleExtra(TEMPERATURE, 0);//Unconverted Temperature in kelvins
        double temperatureConverted = TemperatureConverter.convertTemperature(temperature);//Converted Temperature in celsiums
        double temperatureRounded = TemperatureConverter.round(temperatureConverted, 5);//Rounded Temperature in celsiums

        double humidity = intent.getDoubleExtra(HUMIDITY, 0);
        double pressure = intent.getDoubleExtra(PRESSURE, 0);
        double windSpeed = intent.getDoubleExtra(WIND_SPEED, 0);
        double rain = intent.getDoubleExtra(RAIN, 0);
        double cloudinary = intent.getDoubleExtra(CLOUDINARY, 0);
        String[] dateTime = weatherDate.split(" ");

        cityTextView.setText(cityName);
        dateTextView.setText(dateTime[0]);
        timeTextView.setText(dateTime[1]);
        temperatureTextView.setText(temperatureRounded + " \u2103");
        humidityTextView.setText(humidity + " %");
        preassureTextView.setText(pressure + " hPa");
        windSpeedTextView.setText(windSpeed + " m/sec");
    }
}
