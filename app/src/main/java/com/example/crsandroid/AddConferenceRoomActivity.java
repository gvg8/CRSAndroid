package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddConferenceRoomActivity extends AppCompatActivity {

    private Button CreateGroupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_conference_room);

        CreateGroupButton = (Button) findViewById(R.id.SubmitButton);
        CreateGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}