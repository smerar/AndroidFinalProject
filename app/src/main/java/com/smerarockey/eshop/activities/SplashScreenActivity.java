package com.smerarockey.eshop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.smerarockey.eshop.R;

public class SplashScreenActivity extends AppCompatActivity {
    private static int TIMELIMIT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //To display splash screen for few seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent =new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
            }
        },TIMELIMIT);

    }
}