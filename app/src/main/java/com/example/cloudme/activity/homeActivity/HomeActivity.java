package com.example.cloudme.activity.homeActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cloudme.cloudme.R;

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

    private IHomePresenter presenter;

    private String cityName;

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

        searchCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityName = searchCityEditText.getText().toString();
            }
        });
    }

    @Override
    public void showSuccessMessage() {
        checkImageView.setVisibility(View.VISIBLE);
        resultMessageTextView.setVisibility(View.VISIBLE);
        resultMessageTextView.setText(getResources().getText(R.string.success));
        Toast.makeText(this, getResources().getText(R.string.success), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideSuccessMessage() {
        checkImageView.setVisibility(View.INVISIBLE);
        resultMessageTextView.setVisibility(View.INVISIBLE);
        resultMessageTextView.setText("");
    }

    @Override
    public void showCityNotFoundErrorMessage() {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(getResources().getText(R.string.city_is_not_found));
        Toast.makeText(this, getResources().getText(R.string.city_is_not_found), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideCityNotFoundErrorMessage() {
        errorHomeTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setText("");
    }

    @Override
    public void showWeatherNotFoundErrorMessage() {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(getResources().getText(R.string.weather_is_not_found));
        Toast.makeText(this, getResources().getText(R.string.weather_is_not_found), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideWeatherNotFoundErrorMessage() {
        errorHomeTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setText("");
    }

    @Override
    public void showFieldIsEmptyErrorMessage() {
        resultMessageTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setVisibility(View.VISIBLE);
        errorHomeTextView.setText(getResources().getText(R.string.field_is_empty));
        Toast.makeText(this, getResources().getText(R.string.field_is_empty), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideFieldIsEmptyErrorMessage() {
        errorHomeTextView.setVisibility(View.INVISIBLE);
        errorHomeTextView.setText("");
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
        return searchCityEditText.getText().toString() != null &&
                !searchCityEditText.getText().toString().equals("");
    }
}
