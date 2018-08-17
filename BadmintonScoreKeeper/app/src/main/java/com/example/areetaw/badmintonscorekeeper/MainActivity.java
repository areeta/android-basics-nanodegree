package com.example.areetaw.badmintonscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int gameNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given game number.
     */

    public void displayForGameNumber(int score) {
        TextView scoreView = (TextView) findViewById(R.id.game_number);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increases the score for Team A by 1 points.
     */

    public void onePointForTeamA(View view) {
        if (scoreTeamA > 19) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            gameNumber = gameNumber + 1;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
            displayForGameNumber(gameNumber);
        }
        else {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }
        if (gameNumber >= 3) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            gameNumber = 0;
            displayForTeamA(scoreTeamB);
            displayForTeamB(scoreTeamB);
            displayForGameNumber(gameNumber);
        }
    }

    /**
     * Increases the score for Team B by 1 points.
     */

    public void onePointForTeamB(View view) {
        if (scoreTeamB > 19) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            gameNumber = gameNumber + 1;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
            displayForGameNumber(gameNumber);
        }
        else {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
        if (gameNumber >= 3) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            gameNumber = 0;
            displayForTeamA(scoreTeamB);
            displayForTeamB(scoreTeamB);
            displayForGameNumber(gameNumber);
        }
    }

    /**
     * Resets both scores.
     */

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        gameNumber = 0;
        displayForTeamA(scoreTeamB);
        displayForTeamB(scoreTeamB);
        displayForGameNumber(gameNumber);
    }



}
