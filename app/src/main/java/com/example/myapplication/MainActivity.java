package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nicknameEditText;
        //activity_main.xml 연결
        nicknameEditText = findViewById(R.id.input_text);


        Button finishiButton = (Button) findViewById(R.id.완료_버튼);
        finishiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nicknameText = nicknameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, subActivity.class);
                intent.putExtra("nickname",nicknameText);
                startActivity(intent);
            }
        });

    }


}