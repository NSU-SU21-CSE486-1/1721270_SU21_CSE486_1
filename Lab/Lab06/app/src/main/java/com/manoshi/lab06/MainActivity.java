package com.manoshi.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private int mColor;
    private TextView mShowCountTextView;
    private final String COUNT_KEY = "count";
    private final String COLOR_KEY = "color";
    private final String COUNT_SAVE_KEY = "count_save";
    private SharedPreferences mPreferences;
    private String sharedPrefFile = "com.manoshi.lab06";
    private String COUNT_EXTRA = "count_extra";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}