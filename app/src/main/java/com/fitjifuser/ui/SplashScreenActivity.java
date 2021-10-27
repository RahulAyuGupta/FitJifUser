package com.fitjifuser.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.fitjifuser.R;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashScreenActivity.this, LoginActivity.class);
                in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(in);
                finish();

            }
        }, 2000);
    }
}