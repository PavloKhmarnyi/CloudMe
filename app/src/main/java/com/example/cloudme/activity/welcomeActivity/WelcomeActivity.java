package com.example.cloudme.activity.welcomeActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.cloudme.cloudme.R;

public class WelcomeActivity extends AppCompatActivity {

    private LinearLayout textLinearLayout;
    private LinearLayout buttonLinearLayout;
    private Button nextActivityButton;

    private Animation upToDown;
    private Animation downToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        nextActivityButton = (Button) findViewById(R.id.nextActivityButton);
        buttonLinearLayout = (LinearLayout) findViewById(R.id.buttonLinearLayout);
        textLinearLayout = (LinearLayout) findViewById(R.id.textLinearLayout);

        upToDown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.down_to_up);

        textLinearLayout.setAnimation(upToDown);
        nextActivityButton.setAnimation(downToUp);
    }
}
