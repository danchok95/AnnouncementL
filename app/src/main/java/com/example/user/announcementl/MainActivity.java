package com.example.user.announcementl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button announcementsBtn, eventsBtn, filesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        announcementsBtn = findViewById(R.id.announcementsBtn);
        eventsBtn = findViewById(R.id.eventsBtn);
        filesBtn = findViewById(R.id.filesBtn);

        //adding an onclicklistener to button
        announcementsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == announcementsBtn){
                    finish();
                    startActivity(new Intent(getApplicationContext(), CreateAnnouncement.class));
                }
            }
        });

        eventsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == eventsBtn){
                    finish();
                    startActivity(new Intent(getApplicationContext(), CreateEvent.class));
                }
            }
        });
    }
}
