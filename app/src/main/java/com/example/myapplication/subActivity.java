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

        TextView view_text;
        view_text = findViewById(R.id.tv_text);

        Intent intent = getIntent();
        String nickname = intent.getStringExtra("nickname");
        view_text.setText("닉네임: " + nickname+"님 환영합니다.");





    }
}
