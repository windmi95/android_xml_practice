package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class subActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);

        Intent intent = getIntent();
        String nickname = intent.getStringExtra("nickname");





    }
}
