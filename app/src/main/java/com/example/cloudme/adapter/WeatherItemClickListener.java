package com.example.cloudme.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.cloudme.activity.dailyInfoActivity.DailyInfoActivity;
import com.example.cloudme.service.openWeather.model.WeatherDataTransfer;
import com.example.cloudme.service.openWeather.model.WeatherItem;

import java.util.List;

import static com.example.cloudme.util.Utils.*;

public class WeatherItemClickListener implements View.OnClickListener {
    private Context context;
    private List<WeatherItem> weatherItems;
    private int position;

    public WeatherItemClickListener(Context context, List<WeatherItem> weatherItems, int position) {
        this.context = context;
        this.weatherItems = weatherItems;
        this.position = position;
    }

    @Override
    public void onClick(View view) {
        WeatherItem weatherItem = weatherItems.get(position);
        Intent intent = new Intent(context, DailyInfoActivity.class);
        intent.putExtra(CITY_NAME, WeatherDataTransfer.getInstance().getWeatherData().getCity().getName());
        intent.putExtra(WEATHER_DATE, weatherItem.getDateTimeTxt());
        intent.putExtra(TEMPERATURE, weatherItem.getMain().getTemp());
        intent.putExtra(HUMIDITY, weatherItem.getMain().getHumidity());
        intent.putExtra(PRESSURE, weatherItem.getMain().getPressure());
        intent.putExtra(WIND_SPEED, weatherItem.getWind() != null ? weatherItem.getWind().getSpeed() : 0);
        intent.putExtra(RAIN, weatherItem.getRain() != null ? weatherItem.getRain().getLastThreeHours() : 0);
        intent.putExtra(CLOUDINARY, weatherItem.getClouds().getAll());
        context.startActivity(intent);
    }
}
