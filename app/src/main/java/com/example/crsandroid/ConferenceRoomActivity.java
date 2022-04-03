package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ConferenceRoomActivity extends AppCompatActivity {

    private static final String TAG = "ConferenceRoomActivity";

    private Button mDeleteConferenceRoomButton;
    private Button mBookConferenceRoomButton;
    private Button mAddConferenceRoomButton;
    private ListView mConferenceRoomList;

    private ArrayList<String> conferenceRooms = new ArrayList<String>();

    public static Intent newIntent(Context packageContext) {
        return new Intent(packageContext, ConferenceRoomActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_conference_room);

        conferenceRooms.add("conference room 1");
        conferenceRooms.add("conference room 2");
        conferenceRooms.add("conference room 3");

        mAddConferenceRoomButton = (Button) findViewById(R.id.add_conference_room_button);
        mAddConferenceRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: add conference room");
            }
        });

        mBookConferenceRoomButton = (Button) findViewById(R.id.book_conference_room_button);
        mBookConferenceRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: book conference room");
            }
        });

        mDeleteConferenceRoomButton = (Button) findViewById(R.id.delete_conference_room_button);
        mDeleteConferenceRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: delete conference room");
            }
        });

        mConferenceRoomList = (ListView) findViewById(R.id.conference_room_list);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, conferenceRooms);
        mConferenceRoomList.setAdapter(arrayAdapter);
        mConferenceRoomList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.d(TAG, "onItemClick: clicked item: " + position);
            }
        });
    }
}