package com.manoshi.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {
    public static final String MSG = "com.manoshi.project01.MSG";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        message = intent.getStringExtra(UniversityAffiliation.MSG);
        TextView textView = findViewById(R.id.textView6);
        textView.setText(message);
    }
    public void buttonNext (View view) {
        Intent intent = new Intent(this, ForthActivity.class);
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}