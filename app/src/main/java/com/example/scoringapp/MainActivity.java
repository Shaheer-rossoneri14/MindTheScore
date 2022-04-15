package com.example.scoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int hCount = 0;
    private int aCount = 0;
    private TextView homeScoreCount;
    private TextView awayScoreCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeScoreCount = (TextView) findViewById(R.id.homeScoreCount);
        awayScoreCount = (TextView) findViewById(R.id.awayScoreCount);
    }

    public void hcountUp(View view) {
        hCount++;
        if (homeScoreCount != null)
            homeScoreCount.setText(Integer.toString(hCount));

    }
    public void acountUp(View view) {
        aCount++;
        if (awayScoreCount != null)
            awayScoreCount.setText(Integer.toString(aCount));

    }

}