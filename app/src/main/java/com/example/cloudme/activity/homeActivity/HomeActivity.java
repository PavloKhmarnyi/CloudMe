package com.example.cloudme.activity.homeActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.cloudme.cloudme.R;

/**
 * Created by Slavik on 21.04.2018.
 */

public class HomeActivity extends AppCompatActivity implements HomeActivityView {

    private IHomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        presenter = new HomeActivityPresenter(this);
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
    public void enablesearchCityButton() {

    }
}
