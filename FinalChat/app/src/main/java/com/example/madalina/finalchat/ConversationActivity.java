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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.facebook.Profile;

import java.util.ArrayList;

public class ConversationActivity extends AppCompatActivity {

    ListView listView;
    private ArrayList<String> mesaje = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.convList);
        mesaje.add("Mesaj 1");
        mesaje.add("Mesaj 2");
        mesaje.add("Mesaj 3");
        mesaje.add("Mesaj 4");
        mesaje.add("Mesaj 5");
        mesaje.add("Mesaj 6");



        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, mesaje);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        Button send = (Button)findViewById(R.id.btnSend);
        // Register the onClick listener with the implementation above
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText test   = (EditText)findViewById(R.id.textToSend);
                Profile profile = Profile.getCurrentProfile();
                String currentUserID = profile.getId();
                String currentUserNAME = profile.getName();

                mesaje.add(currentUserNAME+" : "+test.getText().toString());
                test.setText("");
                adapter.notifyDataSetChanged();
            }
        });




    }
}
