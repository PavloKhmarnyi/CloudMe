package com.example.cloudme.cloudme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class WelcomeActivity extends AppCompatActivity {

    LinearLayout linearText, linearBtn;
    Button btnMainActivity;

    Animation upToDown, downToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnMainActivity = (Button)findViewById(R.id.btnMainActivity);
        linearBtn = (LinearLayout)findViewById(R.id.linearBtn);
        linearText = (LinearLayout)findViewById(R.id.linearText);

        upToDown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.down_to_up);

        linearText.setAnimation(upToDown);

        linearBtn.setAnimation(downToUp);
    }
}
