package com.nhif.logintest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FloatLabeledEditText floatLabeledEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatLabeledEditText=findViewById(R.id.nationalId);
        getSupportActionBar().hide();

        //floatLabeledEditText.setText(getResources().getColor(R.color.nhif_darkBlue));
    }
}