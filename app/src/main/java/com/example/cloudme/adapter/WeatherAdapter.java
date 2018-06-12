package com.example.cloudme.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cloudme.cloudme.R;
import com.example.cloudme.service.openWeather.model.WeatherItem;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localhost on 5/5/2018.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private Context context;
    private WeatherItemClickListener listener;
    private LayoutInflater inflater;
    private List<WeatherItem> weatherItems;

    public WeatherAdapter(Context context, List<WeatherItem> weatherItems) {
        this.context = context;
        this.weatherItems = weatherItems;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.weather_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.dayWeatherItemTextView.setText(position + 1 + ".");
        holder.temperatureWeatherItemTextView.setText(weatherItems.get(position).getMain().getTemp() + " \u2103");
        holder.humidityWeatherItemTextView.setText(weatherItems.get(position).getMain().getHumidity() + " %");
        holder.dateWeatherItemTextView.setText(weatherItems.get(position).getDateTimeTxt());
        listener = new WeatherItemClickListener(context, weatherItems, position);
        holder.view.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return weatherItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final View view;
        private final TextView dayWeatherItemTextView;
        private final TextView temperatureWeatherItemTextView;
        private final TextView humidityWeatherItemTextView;
        private final TextView dateWeatherItemTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;

            dayWeatherItemTextView = itemView.findViewById(R.id.dayWeatherItemTextView);
            temperatureWeatherItemTextView = itemView.findViewById(R.id.temperatureWeatherItemTextView);
            humidityWeatherItemTextView = itemView.findViewById(R.id.humidityWeatherItemTextView);
            dateWeatherItemTextView = itemView.findViewById(R.id.dateWeatherItemTextView);
        }
    }
}
