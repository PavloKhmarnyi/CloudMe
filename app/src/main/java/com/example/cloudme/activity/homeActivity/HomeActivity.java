package com.example.cloudme.activity.homeActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cloudme.activity.weatherListActivity.WeatherListActivity;
import com.example.cloudme.cloudme.R;
import com.example.cloudme.service.Config;
import com.example.cloudme.service.google.model.Location;

/**
 * Created by Slavik on 21.04.2018.
 */

public class HomeActivity extends AppCompatActivity implements IHomeView {
    private EditText searchCityEditText;
    private ProgressBar homeActivityProgressBar;
    private ImageView checkImageView;
    private ImageView errorImageView;
    private TextView resultMessageTextView;
    private TextView errorHomeTextView;
    private Button searchCityButton;
    private Button searchWeatherButton;

    private Location location;

    private IHomePresenter presenter;

    private String cityName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        presenter = new HomeActivityPresenter(this);

        searchCityEditText = findViewById(R.id.searchCityEditText);
        homeActivityProgressBar = findViewById(R.id.homeActivityProgressBar);
        checkImageView = findViewById(R.id.checkImageView);
        errorImageView = findViewById(R.id.errorImageView);
        resultMessageTextView = findViewById(R.id.resultMessageTextView);
        errorHomeTextView = findViewById(R.id.errorHomeTextView);
        searchCityButton = findViewById(R.id.searchCityButton);
        searchWeatherButton = findViewById(R.id.searchWeatherButton);

        searchCityEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enableSearchCityButton();
                disableSearchWeatherButton();
                hideCheckImageView();
                hideErrorImageView();
                hideErrorMessage();
            }
        });

        searchCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityName = searchCityEditText.getText().toString();
                if (!isFieldEmpty()) {
                    presenter.fetchCoordinatesFromGoogle(cityName);
                } else {
                    showFieldIsEmptyErrorMessage();
                    disableSearchWeatherButton();
                }
            }
        });

        searchWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (location != null) {
                    presenter.fetchWeatherFromOpenWeather(location.getLatitude(), location.getLongitude() , Config.OPENWEATHER_API_KEY);
                } else {
                    showCityNotFoundErrorMessage();
                    disableSearchCityButton();
                    disableSearchWeatherButton();
                }
            }
        });
    }

    @Override
    public void showSuccessMessage(String message) {
        checkImageView.setVisibility(View.VISIBLE);
        resultMessageTextView.setVisibility(View.VISIBLE);
        resultMessageTextView.setText(message);
        Toast.makeText(this, getResources().getText(R.string.success), Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideSuccessMessage() {
        checkImageView.setVisibility(View.INVISIBLE);
        resultMessageTextView.setVisibility(View.INVISIBLE);
        resultMessageTextView.setText("");
    }

    @Override
    public void showErrorMessage(String errorMessage) {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(errorMessage);
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideErrorMessage() {
        errorHomeTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setText("");
    }

    @Override
    public void showCityNotFoundErrorMessage() {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(getResources().getText(R.string.city_is_not_found));
        Toast.makeText(this, getResources().getText(R.string.city_is_not_found), Toast.LENGTH_LONG).show();
    }

    @Override
    public void showWeatherNotFoundErrorMessage() {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(getResources().getText(R.string.weather_is_not_found));
        Toast.makeText(this, getResources().getText(R.string.weather_is_not_found), Toast.LENGTH_LONG).show();
    }

    @Override
    public void showFieldIsEmptyErrorMessage() {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(getResources().getText(R.string.field_is_empty));
        Toast.makeText(this, getResources().getText(R.string.field_is_empty), Toast.LENGTH_LONG).show();
    }

    @Override
    public void showHomeActivityProgressBar() {
        homeActivityProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideHomeActivityProgressBar() {
        homeActivityProgressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void enableSearchCityButton() {
        if (!searchCityButton.isEnabled()) {
            searchCityButton.setEnabled(true);
        }
    }

    @Override
    public void disableSearchCityButton() {
        if (searchCityButton.isEnabled()) {
            searchCityButton.setEnabled(false);
        }
    }

    @Override
    public void enableSearchWeatherButton() {
        if (!searchWeatherButton.isEnabled()) {
            searchWeatherButton.setEnabled(true);
        }
    }

    @Override
    public void disableSearchWeatherButton() {
        if (searchWeatherButton.isEnabled()) {
            searchWeatherButton.setEnabled(false);
        }
    }

    @Override
    public boolean isFieldEmpty() {
        return searchCityEditText.getText().toString().equals("");
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void startNewActivity() {
        Intent intent = new Intent(HomeActivity.this, WeatherListActivity.class);
        startActivity(intent);
    }

    @Override
    public void showCheckImageView() {
        checkImageView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideCheckImageView() {
        checkImageView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showErrorImageView() {
        errorImageView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideErrorImageView() {
        errorImageView.setVisibility(View.INVISIBLE);
    }
}
