package com.example.cloudme.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cloudme.cloudme.R;
import com.example.cloudme.service.openWeather.model.WeatherItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localhost on 5/5/2018.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private final OnWeatherItemClickListener listener;
    private LayoutInflater inflater;
    private Context context;
    private List<WeatherItem> weatherItems;

    public WeatherAdapter(Context context, ArrayList<WeatherItem> weatherItems, OnWeatherItemClickListener listener) {
        this.listener = listener;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return weatherItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final View view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }
}
