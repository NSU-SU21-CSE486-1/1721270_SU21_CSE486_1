package com.manoshi.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ForthActivity extends AppCompatActivity {
    public static final String MSG = "com.manoshi.project01.MSG";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
    }
    public void buttonNext (View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName2);
        EditText editText2 = findViewById(R.id.editTextTextPersonName3);
        message = getIntent().getStringExtra(ThirdActivity.MSG);
        message += "\nEmail: " + editText1.getText().toString() + "\nPhone: " +
                editText2.getText().toString() ;
        intent.putExtra(MSG, message);
        startActivity(intent);
    }

}