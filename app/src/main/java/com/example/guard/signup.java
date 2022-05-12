package com.example.guard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    TextView mlogin;
    Button msignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mlogin = findViewById(R.id.hola);
        msignup = findViewById(R.id.proceed);
        mlogin.setOnClickListener(v -> {
            Intent intent = new Intent(signup.this, login.class);
            startActivity(intent);
        });
        msignup.setOnClickListener(v -> {
            Intent intent = new Intent(signup.this, number.class);
            startActivity(intent);
        });
    }
}