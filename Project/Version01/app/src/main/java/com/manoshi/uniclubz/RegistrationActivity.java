package com.manoshi.uniclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    private EditText emailReg;
    private EditText passReg;
    private Button btnReg;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Registration();
    }
    private void Registration(){
        emailReg = findViewById(R.id.email_registration);
        passReg = findViewById(R.id.registration_password);
    }
}