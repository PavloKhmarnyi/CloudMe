package com.example.cloudme.activity.homeActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cloudme.cloudme.R;
import com.example.cloudme.service.google.api.GoogleDataApi;
import com.example.cloudme.service.google.api.GoogleDataService;

/**
 * Created by Slavik on 21.04.2018.
 */

public class HomeActivity extends AppCompatActivity implements IHomeView {

    private EditText inputSearchEditText;
    private Button searchCity;

    private IHomePresenter presenter;

    private String cityName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        presenter = new HomeActivityPresenter(this);

        inputSearchEditText = findViewById(R.id.inputSearchEditText);

        searchCity = findViewById(R.id.searchCity);

        searchCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityName = inputSearchEditText.getText().toString();
                if(!presenter.isFieldEmpty(cityName)){
                    presenter.fetchCoordinatesFromGoogle(cityName);
                }else{
                    showErrorMessage();
                }

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

    @Override
    public void disableSearchCityButton() {

    }
}
