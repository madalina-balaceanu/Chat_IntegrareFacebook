package com.example.madalina.finalchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Menu2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button files = (Button)findViewById(R.id.files);
        files.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu2Activity.this, FileActivity.class);
                Menu2Activity.this.startActivity(myIntent);
            }
        });

        Button conv = (Button)findViewById(R.id.conversation);
        conv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu2Activity.this, ConversationActivity.class);
                Menu2Activity.this.startActivity(myIntent);
            }
        });
    }

}
