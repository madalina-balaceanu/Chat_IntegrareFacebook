package com.example.madalina.finalchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        final String jsondata = intent.getStringExtra("jsondata");



        Button groupsList = (Button)findViewById(R.id.groupList);
        groupsList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this, GroupsActivity.class);
                MenuActivity.this.startActivity(myIntent);
            }
        });

        Button notifications = (Button)findViewById(R.id.notifications);
        notifications.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MenuActivity.this, NotificationsActivity.class);
                MenuActivity.this.startActivity(myIntent);
            }
        });

        Button frindsList = (Button)findViewById(R.id.friends);
        frindsList.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MenuActivity.this, FriendsListActivity.class);
                myIntent.putExtra("jsondata", jsondata);
                MenuActivity.this.startActivity(myIntent);
            }
        });


    }

}
