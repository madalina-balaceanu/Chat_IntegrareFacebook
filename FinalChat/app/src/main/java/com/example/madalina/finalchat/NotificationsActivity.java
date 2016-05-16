package com.example.madalina.finalchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class NotificationsActivity extends AppCompatActivity {

    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listNotif);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Notificare 1",
                "Notificare 2",
                "Notificare 3",
                "Notificare 4",
                "Notificare 5",
                "Notificare 6",
                "Notificare 7",
                "Notificare 8"
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent notificare = new Intent(getApplicationContext(),NotificareActivity.class);
                NotificationsActivity.this.startActivity(notificare);

            }

        });
    }




}
