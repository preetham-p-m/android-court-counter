package com.example.android.courtcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA =0;
    int scoreB =0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointForA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }


    public void twoPointForA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowPointForA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }


    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void freeThrowPointForB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void threePointForB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void twoPointForB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }


    /**
     * To clear Scores
     */
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayResult("");
    }

    public void displayResult(String text) {
        TextView resultView = (TextView) findViewById(R.id.result_of_the_match);
        resultView.setText(text);
    }

    public void final_result(View view) {
        if (scoreA > scoreB) {
            displayResult("WINNER IS \n TEAM A");
        }
        else if(scoreB > scoreA){
            displayResult("WINNER IS \n TEAM B");
        }
        else{
            displayResult("SCORES \n LEVEL !!!");
        }
    }
}