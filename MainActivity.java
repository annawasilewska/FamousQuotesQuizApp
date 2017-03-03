package com.example.android.famousquotesquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox questionThird1, questionThird2, questionThird3;
    RadioButton questionFirst, questionSecond, questionFourth, questionFifth, questionSixth, questionSeventh, questionNinth, questionTenth;
    EditText questionEight;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization of RadioButtons, CheckBoxes & EditText
        questionFirst = (RadioButton) findViewById(R.id.first_question3answer);
        questionSecond = (RadioButton) findViewById(R.id.second_question1answer);
        questionThird1 = (CheckBox) findViewById(R.id.third_question1answer);
        questionThird2 = (CheckBox) findViewById(R.id.third_question2answer);
        questionThird3 = (CheckBox) findViewById(R.id.third_question3answer);
        questionFourth = (RadioButton) findViewById(R.id.fourth_question2answer);
        questionFifth = (RadioButton) findViewById(R.id.fifth_question3answer);
        questionSixth = (RadioButton) findViewById(R.id.sixth_question2answer);
        questionSeventh = (RadioButton) findViewById(R.id.seventh_question1answer);
        questionEight = (EditText) findViewById(R.id.eighth_question_answer);
        questionNinth = (RadioButton) findViewById(R.id.ninth_question3answer);
        questionTenth = (RadioButton) findViewById(R.id.tenth_question2answer);
    }

    /**
     * Method counts score & displays it on toast message
     */
    public void submit(View view) {
        if (questionFirst.isChecked()) {
            score = score + 1;
        }
        if (questionSecond.isChecked()) {
            score = score + 1;
        }
        if (questionThird1.isChecked() && questionThird2.isChecked() && !questionThird3.isChecked() ) {
            score = score + 1;
        }
        if (questionFourth.isChecked()) {
            score = score + 1;
        }
        if (questionFifth.isChecked()) {
            score = score + 1;
        }
        if (questionSixth.isChecked()) {
            score = score + 1;
        }
        if (questionSeventh.isChecked()) {
            score = score + 1;
        }
        if (String.valueOf(questionEight.getText()).equals(getString(R.string.eight_answer)) || String.valueOf(questionEight.getText()).equals(getString(R.string.eight_answer)+ " ")) {
            score = score + 1;
        }
        if (questionNinth.isChecked()) {
            score = score + 1;
        }
        if (questionTenth.isChecked()) {
            score = score + 1;
        }

        String text = getString(R.string.totalValue) + " " + score;
        if (score == 10) {
            text = text + "\n" + getString(R.string.theBest);
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
        score = 0;
    }
}
