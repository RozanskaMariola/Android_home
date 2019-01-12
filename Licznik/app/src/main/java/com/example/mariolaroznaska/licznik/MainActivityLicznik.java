package com.example.mariolaroznaska.licznik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityLicznik extends AppCompatActivity {

    private int _counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_licznik);

    }

    public void button_click_zw(View view){

        TextView tV = (TextView) findViewById(R.id.textView);
        _counter++;

        tV.setText(String.valueOf(_counter));

    }


    public void button_click_zm(View view){

        TextView tV = (TextView) findViewById(R.id.textView);
        _counter--;

        tV.setText(String.valueOf(_counter));

    }


    public void button_click_zeruj(View view){

        TextView tV = (TextView) findViewById(R.id.textView);
        _counter = 0;

        tV.setText(String.valueOf(_counter));

    }

    public void button_click_ch(View view){

        EditText eT = (EditText) findViewById(R.id.editText);
        _counter = Integer.parseInt(eT.getText().toString());

        eT.setText(String.valueOf(_counter));

        TextView tV = (TextView) findViewById(R.id.textView);
        tV.setText(String.valueOf(_counter));


    }

}
