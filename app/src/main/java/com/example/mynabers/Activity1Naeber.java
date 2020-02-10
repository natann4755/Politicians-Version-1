package com.example.mynabers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Activity1Naeber extends AppCompatActivity {

    private neighbor myNeighbor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_naeber);

        Intent intent = getIntent();
        myNeighbor = intent.getParcelableExtra("naiber");

    }
}
