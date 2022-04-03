package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private static final int REQUEST_CODE_LOGIN = 0;

    private Button mButtonLogin;

    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, RegisterActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mButtonLogin = (Button) findViewById(R.id.login_at_sign_up_screen_button);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = LoginActivity.newIntent(RegisterActivity.this);
                startActivityForResult(intent, REQUEST_CODE_LOGIN);
            }
        });

    }
}