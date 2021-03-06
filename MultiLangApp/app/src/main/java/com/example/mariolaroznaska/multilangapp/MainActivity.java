package com.example.mariolaroznaska.multilangapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String closeString = getResources().getString(R.string.close_app);
        Button button = (Button) findViewById(R.id.button_close);
        button.setText(closeString);
    }

    public void closeApp(View view){
        finish();
    }
}
