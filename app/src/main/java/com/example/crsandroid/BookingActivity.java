package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BookingActivity extends AppCompatActivity {

    private static final String TAG = "BookingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        EditText dateFromEditText = (EditText) findViewById(R.id.date_from_text);
        String dateFrom = dateFromEditText.getText().toString();

        EditText timeFromEditText = (EditText) findViewById(R.id.time_from_text);
        String timeFrom = timeFromEditText.getText().toString();

        EditText dateToEditText = (EditText) findViewById(R.id.date_to_text);
        String dateTo = dateToEditText.getText().toString();

        EditText timeToEditText = (EditText) findViewById(R.id.time_to_text);
        String timeTo = timeToEditText.getText().toString();

        String conferenceRoomName = "Room 2";
        String booking_conference_room_text = getString(R.string.booking_conference_room_text, conferenceRoomName);
        Toast.makeText(getApplicationContext(), booking_conference_room_text, Toast.LENGTH_LONG).show();
    }

    public void bookRoomButtonHandler(View view) {
        // TODO:Decide what happens when the user clicks the submit button

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }


}