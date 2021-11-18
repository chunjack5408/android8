package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv1 = findViewById(R.id.textView4);
        Intent intent = this.getIntent();
        String bmi = intent.getStringExtra("bmi");
        String w = intent.getStringExtra("w");
        tv1.setText("你的BMI指數為"+bmi+'\n'+"檢測結果為"+w);
    }
}