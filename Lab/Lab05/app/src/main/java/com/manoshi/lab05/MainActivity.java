package com.manoshi.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton play;
    TextView title;

    NotificationManager notificationManager;
    List<Track> tracks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void populateTracks(){
        tracks = new ArrayList<>();
        tracks.add(new Track("Track 1", "Artist 1", R.drawable.t1));
        tracks.add(new Track("Track 2", "Artist 2", R.drawable.t2));
        tracks.add(new Track("Track 3", "Artist 1", R.drawable.t3));
    }
}