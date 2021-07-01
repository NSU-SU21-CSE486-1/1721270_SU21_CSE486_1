package com.example.hello_toast_lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }
    public void onToast(View view){
        Toast t = Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT);
        t.show();
    }
    public void onCount(View view){
        count++;
        textView.setText(Integer.toString(count));
    }
}