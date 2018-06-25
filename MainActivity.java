package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double score = 0.0;
    double numberOfQuestions = 4.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //checking of radio button and awarding of points method
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_1a:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_1b:
                if (checked)
                    score = score + 1; //point awarded
                break;
            case R.id.radio_1c:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_1d:
                if (checked)
                    score = score + 0; //point not awarded
                break;
        }
    }

    //checking of radio button and awarding of points method
    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_2a:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_2b:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_2c:
                if (checked)
                    score = score + 1; //point awarded
                break;
            case R.id.radio_2d:
                if (checked)
                    score = score + 0; //point not awarded
                break;
        }
    }

    //checking of radio button and awarding of points method
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_3a:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_3b:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_3c:
                if (checked)
                    score = score + 1; //point awarded
                break;
            case R.id.radio_3d:
                if (checked)
                    score = score + 0; //point not awarded
                break;
        }
    }

    //checking of radio button and awarding of points method
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_4a:
                if (checked)
                    score = score + 1; //point awarded
                break;
            case R.id.radio_4b:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_4c:
                if (checked)
                    score = score + 0; //point not awarded
                break;
            case R.id.radio_4d:
                if (checked)
                    score = score + 0; //point not awarded
                break;
        }

    }

    /**
     * Initializes the RadioGroups
     * @param view
     */
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;

    //Clear checked radio buttons method
    public void clearSelection() {
        //find radio buttons
        radioGroup1 = findViewById(R.id.question_1_radio_group);
        radioGroup2 = findViewById(R.id.question_2_radio_group);
        radioGroup3 = findViewById(R.id.question_3_radio_group);
        radioGroup4 = findViewById(R.id.question_4_radio_group);

        //check whether the radio are checked and clear checked radio buttons
        if (radioGroup1 != null) radioGroup1.clearCheck();
        if (radioGroup2 != null) radioGroup2.clearCheck();
        if (radioGroup3 != null) radioGroup3.clearCheck();
        if (radioGroup4  != null) radioGroup4.clearCheck();
    }

    //reset score and uncheck radio buttons
    public void resetScore(View view) {
        score = 0;
        scoreView(score, numberOfQuestions);
        clearSelection();

    }

    //submit button
    public void submitAnswers(View view) {
        scoreView(score, numberOfQuestions);
    }

    //score view method
    public void scoreView(double number, double total) {
        //Find the text view that displays the score
        TextView viewScoreTextView = findViewById(R.id.score_view);
        //calculates number/total the displays it on the text view and put % next to the number
        viewScoreTextView.setText((number * 100 / total) + "%");
    }
}

