package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity {

    private static final String TAG = "IndexActivity";
    private static final int REQUEST_CODE_LOGIN = 0;
    private static final int REQUEST_CODE_GROUP = 3;
    private static final int REQUEST_CODE_CONFERENCE_ROOM = 4;

    private Button mButtonConferenceRoom;
    private Button mButtonGroup;
    private Button mButtonSignOut;

    public static Intent newIntent(Context packageContext) {
            Intent intent = new Intent(packageContext, IndexActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        mButtonConferenceRoom = (Button) findViewById(R.id.conference_room_button);
        mButtonConferenceRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ConferenceRoomActivity.newIntent(IndexActivity.this);
                startActivityForResult(intent, REQUEST_CODE_CONFERENCE_ROOM);
            }
        });

        mButtonGroup = (Button) findViewById(R.id.group_button);
        mButtonGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = GroupActivity.newIntent(IndexActivity.this);
                startActivityForResult(intent, REQUEST_CODE_GROUP);
            }
        });

        mButtonSignOut = (Button) findViewById(R.id.sign_out_button);
        mButtonSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = LoginActivity.newIntent(IndexActivity.this);
                startActivityForResult(intent, REQUEST_CODE_LOGIN);
            }
        });

    }
}