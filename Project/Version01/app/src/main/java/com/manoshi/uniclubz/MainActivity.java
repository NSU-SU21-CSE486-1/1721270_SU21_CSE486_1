package com.manoshi.uniclubz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    private Button btnLogin;
    private Button btnRegistration;

    //Firebase
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        LoginFunction();
    }

    private void LoginFunction(){

        email = findViewById(R.id.email_login);
        password = findViewById(R.id.login_password);

        btnLogin = findViewById(R.id.btn_login);
        btnRegistration = findViewById(R.id.btn_reg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (TextUtils.isEmpty(mEmail)){
                    email.setError("Required Field");
                    return;
                }
                if (TextUtils.isEmpty(pass)){
                    password.setError("Required Field");
                }
                mAuth.signInWithEmailAndPassword(mEmail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        }
                    }
                });
            }
        });
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(getApplicationContext(), RegistrationActivity.class));

            }
        });
    }
}