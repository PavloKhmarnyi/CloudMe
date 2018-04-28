package com.example.cloudme.activity.welcomeActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cloudme.cloudme.R;
import com.example.cloudme.util.Config;
import com.example.cloudme.util.PermissionManager;

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

    @Override
    public void onResume(){
        super.onResume();

        if (!PermissionManager.isPermissions(WelcomeActivity.this)){
            PermissionManager.requestPermissions(WelcomeActivity.this);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == Config.PERMISSION_REQUEST_CODE && grantResults.length == 2 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED ){
           // Intent intent = new Intent(this, NextActivity.class)
            //startActivity(intent)
        }else{
            Toast.makeText(this, "Permission not allowed",Toast.LENGTH_SHORT).show();
        }
    }
}
