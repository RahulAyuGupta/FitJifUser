package com.fitjifuser.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fitjifuser.R;

public class SignupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        findViewById(R.id.signUpBtn).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        Intent in = new Intent(SignupActivity.this, MainActivity.class);
                        in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        finish();
                    }
                });


        findViewById(R.id.already_user).setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        Intent in = new Intent(SignupActivity.this, LoginActivity.class);
                        in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        //finish();


                    }
                });

    }
}


