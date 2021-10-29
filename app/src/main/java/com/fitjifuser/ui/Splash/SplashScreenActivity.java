package com.fitjifuser.ui.Splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.fitjifuser.R;
import com.fitjifuser.ui.MyWorkout.MyWorkoutActivity;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashScreenActivity.this, MyWorkoutActivity.class);
                in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(in);
                finish();

            }
        }, 2000);
    }
}