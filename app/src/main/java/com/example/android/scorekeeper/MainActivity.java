package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    public void threePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void onePointTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void sixPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    public void threePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void onePointTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the score for Team A
     */
    public void displayForTeamA(int score){
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    /**
     * Displays the score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }

    }

