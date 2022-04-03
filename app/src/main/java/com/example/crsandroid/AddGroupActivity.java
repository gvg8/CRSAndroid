package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddGroupActivity extends AppCompatActivity {

    private Button mCreateGroupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group);

        mCreateGroupButton = (Button) findViewById(R.id.CreateGroup);
        mCreateGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.NewGroupName);
                String value = editText.getText().toString();

                Intent intent = new Intent(AddGroupActivity.this, GroupActivity.class);
                intent.putExtra("newgroup", value);
                startActivity(intent);
            }
        });
    }
}