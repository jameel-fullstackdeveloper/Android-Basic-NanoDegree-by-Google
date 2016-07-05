package com.example.aazarjameeel.udacityquizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*  Global Variables to store the right answers */
    int mAnswerOneScore=0;
    int mAnswerTwoScore=0;
    int mAnswerThreeScore=0;
    int mAnswerFourScore=0;
    int mAnswerFiveScore=0;
    int mAnswerSixScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Question One Click*/
    public void onRadioButtonQ1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_answerOneA:
                if (checked)
                    mAnswerOneScore= 0;
                    break;
            case R.id.radio_answerOneB:
                if (checked)
                    mAnswerOneScore =10;
                    break;
            case R.id.radio_answerOneC:
                if (checked)
                    mAnswerOneScore= 0;
                    break;
        }
    }

    /* Question Two Click*/
    public void onRadioButtonQ2Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_answerTwoA:
                if (checked)
                    mAnswerTwoScore= 10;
                break;
            case R.id.radio_answerTwoB:
                if (checked)
                    mAnswerTwoScore =0;
                break;
            case R.id.radio_answerTwoC:
                if (checked)
                    mAnswerTwoScore= 0;
                break;
        }
    }

    /* Question Three Click*/
    public void getAnswerThee(){
        /* Gettting Answer Three*/
        EditText answertext   = (EditText)findViewById(R.id.text_answerthree);

        if (answertext.getText().toString().equals("Islamabad") ||answertext.getText().toString().equals("islamabad") ) {
            mAnswerThreeScore=10;
        }else {
            mAnswerThreeScore=0;
        }
    }

    /* Question Four Click*/
    public void onRadioButtonQ4Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_answerFourA:
                if (checked)
                    mAnswerFourScore= 0;
                break;
            case R.id.radio_answerFourB:
                if (checked)
                    mAnswerFourScore =10;
                break;
            case R.id.radio_answerFourC:
                if (checked)
                    mAnswerFourScore= 0;
                break;
        }
    }

    /* Question Five Click*/
    public void onRadioButtonQ5Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_answerFiveA:
                if (checked)
                    mAnswerFiveScore= 10;
                break;
            case R.id.radio_answerFiveB:
                if (checked)
                    mAnswerFiveScore =0;
                break;
            case R.id.radio_answerFiveC:
                if (checked)
                    mAnswerFiveScore= 0;
                break;
        }
    }

    /* Question Six Click*/
    public void onCheckboxQ6Clicked(View view) {

        CheckBox chkBoxOne = (CheckBox) findViewById(R.id.checkbox_answerSixA);
        CheckBox chkBoxTwo = (CheckBox) findViewById(R.id.checkbox_answerSixB);
        CheckBox chkBoxThree = (CheckBox) findViewById(R.id.checkbox_answerSixC);

        if(chkBoxOne.isChecked() && chkBoxTwo.isChecked()){
            mAnswerSixScore=10;
        }
        if(chkBoxThree.isChecked()){
            mAnswerSixScore=0;
        }
   }

    /* Display the Result */
    public void displayScore(View view){

        getAnswerThee();

        int totalScore= mAnswerOneScore + mAnswerTwoScore + mAnswerThreeScore +  mAnswerFourScore + mAnswerFiveScore + mAnswerSixScore;

        TextView score=(TextView) findViewById(R.id.textScore);
        score.setText("Total Score: " + totalScore);
        //Toast.makeText(this, "Total Score: " + totalScore, Toast.LENGTH_SHORT).show();

    }


}
