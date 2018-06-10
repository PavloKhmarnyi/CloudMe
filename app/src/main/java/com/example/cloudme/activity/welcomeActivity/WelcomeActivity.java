package com.example.cloudme.activity.welcomeActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cloudme.activity.homeActivity.HomeActivity;
import com.example.cloudme.cloudme.R;
import com.example.cloudme.util.Utils;
import com.example.cloudme.util.PermissionManager;

public class WelcomeActivity extends AppCompatActivity {

    private TextView welcome_message;
    private Button nextActivityButton;
    private ImageView imageView;

    private Animation upToDown;
    private Animation downToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        nextActivityButton = (Button) findViewById(R.id.nextActivityButton);
        welcome_message = (TextView) findViewById(R.id.welcome_message);
        imageView = (ImageView) findViewById(R.id.imageView);

        upToDown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.down_to_up);

        imageView.setAnimation(upToDown);
        welcome_message.setAnimation(upToDown);
        nextActivityButton.setAnimation(downToUp);

        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
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

        if (requestCode == Utils.PERMISSION_REQUEST_CODE && grantResults.length == 2 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED ){
            //
        } else {
            Toast.makeText(this, "Permission not allowed",Toast.LENGTH_SHORT).show();
        }
    }
}
