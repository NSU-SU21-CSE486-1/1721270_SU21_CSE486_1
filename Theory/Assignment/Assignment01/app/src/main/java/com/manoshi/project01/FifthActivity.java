package com.manoshi.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FifthActivity extends AppCompatActivity {
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        message = getIntent().getStringExtra(ForthActivity.MSG);
    }

}