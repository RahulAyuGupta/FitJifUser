package com.fitjifuser.ui.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fitjifuser.R;
import com.fitjifuser.ui.SelectCategory.SelectCategoryActivity;
import com.fitjifuser.ui.SignUp.SignupActivity;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.loginBtn).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        Intent in = new Intent(LoginActivity.this, SelectCategoryActivity.class);
                        in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        finish();
                    }
                });


        findViewById(R.id.createAccount).setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        Intent in = new Intent(LoginActivity.this, SignupActivity.class);
                        in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        //finish();


                    }
                });

    }
}