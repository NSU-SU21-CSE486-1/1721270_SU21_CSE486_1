package com.example.happy_birthday_lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Happy Birthday to Manoshi");
        try {
            int x = 45/0;
        }
        catch (Exception e) {
            Log.e("MainActivity", "Happy Birthday");
        }
    }
}