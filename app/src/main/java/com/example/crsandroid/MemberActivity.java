package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MemberActivity extends AppCompatActivity {

    private Button mCreateMemberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        TextView groupName = (TextView) findViewById(R.id.groupName);
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
        groupName.setText(Group);

        mCreateMemberButton = (Button) findViewById(R.id.add_member);
        mCreateMemberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MemberActivity.this,addMemberActivity.class);
                intent.putExtra("group", Group);
                startActivity(intent);
            }
        });
    }
}