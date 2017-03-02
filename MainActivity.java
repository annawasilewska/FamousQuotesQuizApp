package com.example.android.famousquotesquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        int pointsQuestion1 = questionFirst();
        int pointsQuestion2 = questionSecond();
        int pointsQuestion3 = questionThird();
        int pointsQuestion4 = questionFourth();
        int pointsQuestion5 = questionFifth();
        int pointsQuestion6 = questionSixth();
        int pointsQuestion7 = questionSeventh();
        int pointsQuestion8 = questionEight();
        int pointsQuestion9 = questionNinth();
        int pointsQuestion10 = questionTenth();
        int totalScore =(pointsQuestion1 + pointsQuestion2 + pointsQuestion3 + pointsQuestion4 + pointsQuestion5 + pointsQuestion6 + pointsQuestion7 + pointsQuestion8 + pointsQuestion9 + pointsQuestion10);
        String text = getString(R.string.totalValue) + totalScore;
        if (totalScore == 10) {
            text = text + "\n" + getString(R.string.theBest);
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }

    /***
     * First question method
     * @return points
     */
    public int questionFirst() {
        int points;
        boolean answer3 = ((RadioButton) findViewById(R.id.first_question3answer)).isChecked();
        if (answer3) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /***
     * Second question method
     * @return points
     */
    public int questionSecond() {
        int points;
        boolean answer1 = ((RadioButton) findViewById(R.id.second_question1answer)).isChecked();
        if (answer1) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /**
     * Third question method
     * @return points
     */
    public int questionThird() {
        int points;
        boolean answer1 = ((CheckBox) findViewById(R.id.third_question1answer)).isChecked();
        boolean answer2 = ((CheckBox) findViewById(R.id.third_question1answer)).isChecked();
        if (answer1 && answer2) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /***
     * Fourth question method
     * @return points
     */
    public int questionFourth() {
        int points;
        boolean answer2 = ((RadioButton) findViewById(R.id.fourth_question2answer)).isChecked();
        if (answer2) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /***
     * Fifth question method
     * @return points
     */
    public int questionFifth() {
        int points;
        boolean answer3 = ((RadioButton) findViewById(R.id.fifth_question3answer)).isChecked();
        if (answer3) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /***
     * Sixth question method
     * @return points
     */
    public int questionSixth() {
        int points;
        boolean answer2 = ((RadioButton) findViewById(R.id.sixth_question2answer)).isChecked();
        if (answer2) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /***
     * Seventh question method
     * @return points
     */
    public int questionSeventh() {
        int points;
        boolean answer1 = ((RadioButton) findViewById(R.id.seventh_question1answer)).isChecked();
        if (answer1) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /***
     * Eight question method
     * @return points
     */
    public int questionEight() {
        int points;
        EditText questionEight = (EditText) findViewById(R.id.eighth_question_answer);
        String answer = String.valueOf(questionEight.getText());
        if (answer.equals(getString(R.string.eight_answer)) || answer.equals(getString(R.string.eight_answer)+" ")) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /**
     * Nineth question method
     * @return points
     */
    public int questionNinth() {
        int points;
        boolean answer3 = ((RadioButton) findViewById(R.id.ninth_question3answer)).isChecked();
        if (answer3) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    /**
    *Tenth question method
    *@return points
     */
    public int questionTenth() {
        int points;
        boolean answer2 = ((RadioButton) findViewById(R.id.tenth_question2answer)).isChecked();
        if (answer2) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }
}
