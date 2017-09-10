package com.example.codestudio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    void onClick(View view) {
        switch (view.getId()) {
            case R.id.example01:
                startActivity(new Intent(this, Example01.class));
                break;
            case R.id.example02:
                startActivity(new Intent(this, Example02.class));
                break;
            case R.id.example03:
                startActivity(new Intent(this, Example03.class));
                break;
            case R.id.example04:
                startActivity(new Intent(this, Example04.class));
                break;
            case R.id.example05:
                startActivity(new Intent(this, Example05.class));
                break;
            case R.id.example06:
                startActivity(new Intent(this, Example06.class));
                break;
        }
    }
}
