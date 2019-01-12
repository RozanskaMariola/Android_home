package com.example.mariolaroznaska.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainContent extends AppCompatActivity {


    private EditText n1EditText;
    private EditText n2EditText;
    private EditText resEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        n1EditText = (EditText) findViewById(R.id.n1EditText);
        n2EditText = (EditText) findViewById(R.id.n2EditText);
        resEditText = (EditText) findViewById(R.id.resEditText);

    }
}
