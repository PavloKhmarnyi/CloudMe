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
    private EditText inputSearchEditText;
    private ProgressBar progressBar;
    private ImageView checkImageView;
    private ImageView errorImageView;
    private TextView errorHomeTextView;
    private Button searchCityButton;

    private IHomePresenter presenter;

    private String cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        presenter = new HomeActivityPresenter(this);

        inputSearchEditText = findViewById(R.id.inputSearchEditText);
        progressBar = findViewById(R.id.progressBar);
        checkImageView = findViewById(R.id.checkImageView);
        errorImageView = findViewById(R.id.errorImageView);
        errorHomeTextView = findViewById(R.id.errorHomeTextView);
        searchCityButton = findViewById(R.id.searchCityButton);


        searchCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityName = inputSearchEditText.getText().toString();
            }
        });
    }
/*
 пустий рядок
 не знайдено погоду
 не знайдено місто
  */



    @Override
    public void showErrorMessage() {
        Toast.makeText(HomeActivity.this, "We can't find this city\n", Toast.LENGTH_LONG).show();
        errorImageView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideErrorMessage() {
        errorImageView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showSuccessMessage() {
        checkImageView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideSuccessMessage() {
        checkImageView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showUserLoadingProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideUserLoadingProgressBar() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void enableSearchCityButton() {
        searchCityButton.setEnabled(true);
    }

    @Override
    public void disableSearchCityButton() {
        searchCityButton.isEnabled();
        searchCityButton.setEnabled(false);
    }

    @Override
    public void isFieldsEmpty() {
        if(inputSearchEditText.getText().toString().equals("")){
            return;
        }
    }

    @Override
    public void isCityFound() {

    }

    @Override
    public void isWeatherFound() {

    }
}
