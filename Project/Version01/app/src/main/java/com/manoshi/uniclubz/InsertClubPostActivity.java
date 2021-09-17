package com.manoshi.uniclubz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertClubPostActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText event_title;
    private EditText event_description;
    private EditText club_name;
    private EditText event_date;

    private Button btn_post_event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_club_post);

        toolbar = findViewById(R.id.insert_club_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Post Event");
        InsertClub();
    }

    private void InsertClub(){
        event_title = findViewById(R.id.club_title);
        event_description = findViewById(R.id.club_description);
        club_name = findViewById(R.id.club_name);
        event_date = findViewById(R.id.club_date);

        btn_post_event = findViewById(R.id.btn_club_post);
        btn_post_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = event_title.getText().toString().trim();
                String description = event_description.getText().toString().trim();
                String name = club_name.getText().toString().trim();
                String date = event_date.getText().toString().trim();
            }
        });
    }

}