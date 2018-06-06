package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //    Declare variables
    int franceGoals = 0;
    int franceGoalsId = R.id.franceGoals;
    int franceYellows = 0;
    int franceYellowsId = R.id.franceYellowCards;
    int franceReds = 0;
    int franceRedsId = R.id.franceRedCards;

    int spainGoals = 0;
    int spainGoalsId = R.id.spainGoals;
    int spainYellows = 0;
    int spainYellowsId = R.id.spainYellowCards;
    int spainReds = 0;
    int spainRedsId = R.id.spainRedCards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFranceGoal(View v) {
        franceGoals++;
        displayNumberInId(franceGoals, franceGoalsId);
    }

    public void addFranceYellow(View v) {
        franceYellows++;
        displayNumberInId(franceYellows, franceYellowsId);
    }

    public void addFranceRed(View v) {
        franceReds++;
        displayNumberInId(franceReds, franceRedsId);
    }

    public void addSpainGoal(View v) {
        spainGoals++;
        displayNumberInId(spainGoals, spainGoalsId);
    }

    public void addSpainYellow(View v) {
        spainYellows++;
        displayNumberInId(spainYellows, spainYellowsId);
    }

    public void addSpainRed(View v) {
        spainReds++;
        displayNumberInId(spainReds, spainRedsId);
    }

    public void displayNumberInId(int aNumber, int anId) {
        TextView textToUpdate = (TextView) findViewById(anId);
        textToUpdate.setText(String.valueOf(aNumber));
    }
}
