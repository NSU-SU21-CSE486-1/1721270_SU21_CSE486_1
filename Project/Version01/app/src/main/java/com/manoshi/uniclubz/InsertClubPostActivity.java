package com.manoshi.uniclubz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
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
    }

}