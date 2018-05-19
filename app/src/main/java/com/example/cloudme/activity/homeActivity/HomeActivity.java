package com.example.cloudme.activity.homeActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.cloudme.cloudme.R;

/**
 * Created by Slavik on 21.04.2018.
 */

public class HomeActivity extends AppCompatActivity implements IHomeView {
    private EditText inputSearchEditText;
    private Button searchCity;
    private Button showWeather;
    private ProgressBar progressBar;
    private ImageView check;
    private ImageView error;
    private TextView resultMessageTextView;
    private TextView ErrorHomeTextView;

    private IHomePresenter presenter;

    private String cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        presenter = new HomeActivityPresenter(this);

        inputSearchEditText = findViewById(R.id.inputSearchEditText);
        searchCity = findViewById(R.id.searchCity);
        showWeather = findViewById(R.id.showWeather);
        progressBar = findViewById(R.id.progressBar);
        check = findViewById(R.id.check);
        error = findViewById(R.id.error);
        resultMessageTextView = findViewById(R.id.resultMessageTextView);
        ErrorHomeTextView = findViewById(R.id.ErrorHomeTextView);



        searchCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityName = inputSearchEditText.getText().toString();
            }
        });
    }

    @Override
    public void showErrorMessage() {

    }

    @Override
    public void hideErrorMessage() {

    }

    @Override
    public void hideSuccessMessage() {

    }

    @Override
    public void showSuccessMessage() {

    }

    @Override
    public void showUserLoadingProgressBar() {

    }

    @Override
    public void hideUserLoadingProgressBar() {

    }

    @Override
    public void enableSearchCityButton() {

    }
}
