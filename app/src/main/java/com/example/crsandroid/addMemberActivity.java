package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class addMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);

        TextView groupName = (TextView) findViewById(R.id.add_member_header);
        String Group;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                Group= null;
            } else {
                Group= extras.getString("group");
            }
        } else {
            Group = (String) savedInstanceState.getSerializable("group");
        }
        String str = "Create New Member for the group "+ Group + "!";
        groupName.setText(str);
    }
}