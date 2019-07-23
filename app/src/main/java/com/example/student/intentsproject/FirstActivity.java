package com.example.student.intentsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText no1;
    EditText no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        no1 = findViewById(R.id.editText);

    }



}
