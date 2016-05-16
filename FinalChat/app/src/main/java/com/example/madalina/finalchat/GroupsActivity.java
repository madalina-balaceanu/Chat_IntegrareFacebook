package com.example.madalina.finalchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.ImageView;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView meniuGroup = (ImageView)findViewById(R.id.gr1);
        meniuGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(GroupsActivity.this, Menu2Activity.class);
                GroupsActivity.this.startActivity(myIntent);
            }
        });

        ImageView meniuGroup2 = (ImageView)findViewById(R.id.gr2);
        meniuGroup2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(GroupsActivity.this, Menu2Activity.class);
                GroupsActivity.this.startActivity(myIntent);
            }
        });

        ImageView meniuGroup3 = (ImageView)findViewById(R.id.gr3);
        meniuGroup3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(GroupsActivity.this, Menu2Activity.class);
                GroupsActivity.this.startActivity(myIntent);
            }
        });




    }

}
