package com.manoshi.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.manoshi.project01.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonNext (View view) {
        Intent intent = new Intent(this, UniversityAffiliation.class);
        EditText editText1 = findViewById(R.id.textinput1);
        EditText editText2 = findViewById(R.id.textinput2);
        EditText editText3= findViewById(R.id.textinput3);
        EditText editText4 = findViewById(R.id.textinput4);
        String message = "Name: " + editText1.getText().toString() + "\nDate of Birth: " +
                editText2.getText().toString() + "\nNID: " +
                editText3.getText().toString() + "\nBlood Group: " +
                editText4.getText().toString() ;
        Log.i("message", message);
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}