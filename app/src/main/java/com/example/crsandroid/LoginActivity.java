package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_CODE_INDEX = 0;
    private static final int REQUEST_CODE_REGISTER = 1;

    private Button mButtonSignIn;
    private Button mButtonRegister;

    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, LoginActivity.class);
        return intent;
    }

    public void loginErrorMsg() {
        Toast.makeText(this,R.string.wrong_username_or_password_toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /* Hafa textan gráan eða svartan?
        TextView bigLoginTextView = findViewById(R.id.login_to_your_account_text);
        bigLoginTextView.setTextColor(Color.BLACK);

        TextView registerQuestionTextView = findViewById(R.id.already_have_account);
        registerQuestionTextView.setTextColor(Color.BLACK);
        */

        mButtonSignIn = (Button) findViewById(R.id.sign_in_button);
        mButtonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText usernameEditText = (EditText) findViewById(R.id.username_edit_text);
                String username = usernameEditText.getText().toString();
                EditText passwordEditText = (EditText) findViewById(R.id.password_edit_text);
                String password = passwordEditText.getText().toString();

                if (username.equals("admin") && password.equals("admin")) {
                    Intent intent = IndexActivity.newIntent(LoginActivity.this);
                    startActivityForResult(intent, REQUEST_CODE_INDEX);
                } else {
                    loginErrorMsg();
                }

                // TODO: Check if username and password match with a user and accept/decline the sign in.
            }
        });

        mButtonRegister = (Button) findViewById(R.id.register_at_login_screen_button);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = RegisterActivity.newIntent(LoginActivity.this);
                startActivityForResult(intent, REQUEST_CODE_REGISTER);
            }
        });
    }
}