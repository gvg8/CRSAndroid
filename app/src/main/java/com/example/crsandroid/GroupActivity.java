package com.example.crsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class GroupActivity extends AppCompatActivity {

    private ArrayList<String> groups = new ArrayList<String>();

    private Button mCreateGroupButton;
    private ListView mGroupList;

    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, GroupActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        groups.add("lalalala");
        groups.add("lalalala");
        groups.add("lalalala");
        groups.add("lalalala");

        String newGroup;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newGroup= null;
            } else {
                newGroup= extras.getString("newgroup");
                groups.add(newGroup);
            }
        } else {
            newGroup = (String) savedInstanceState.getSerializable("newgroup");
            groups.add(newGroup);
        }


        mCreateGroupButton = (Button) findViewById(R.id.add_group);
        mCreateGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupActivity.this,AddGroupActivity.class);
                startActivity(intent);
            }
        });
        mGroupList = (ListView) findViewById(R.id.group_list);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,groups);
        mGroupList.setAdapter(arrayAdapter);
        mGroupList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(GroupActivity.this, MemberActivity.class);
                intent.putExtra("group",groups.get(position));
                startActivity(intent);
            }
        });

    }
}