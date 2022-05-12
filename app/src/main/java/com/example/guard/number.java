package com.example.guard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class number extends AppCompatActivity {
    TextView motp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        motp = (TextView) findViewById(R.id.otp);
        motp.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "OTP sent successfully", Toast.LENGTH_LONG).show();
        });
    }
}