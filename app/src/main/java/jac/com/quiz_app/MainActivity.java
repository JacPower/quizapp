package jac.com.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    //==== Question 1====
    RadioButton quiz1_answ3;
    //==== Question 2====
    EditText quiz2_answ;
    //==== Question 3====
    CheckBox quiz3_answ1;
    CheckBox quiz3_answ2;
    CheckBox quiz3_answ3;
    //==== Question 4====
    RadioButton question4_answer;
    //==== Question 5====
    EditText question5_answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(jac.com.quiz_app.R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(jac.com.quiz_app.R.menu.forecast, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == jac.com.quiz_app.R.id.action_Answers) {
            Intent i = new Intent(MainActivity.this, answer.class);
            startActivity(i);
            this.finish();
            return true;
        }
        if (id == jac.com.quiz_app.R.id.Exit) {
            Intent i = new Intent(MainActivity.this, goodbyeActivity.class);
            startActivity(i);
            this.finish();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    public void submit(View v) {
        CharSequence resultsDisplay;
        int answer1_score=0;
        int answer2_score=0;
        int answer3_score=0;
        int answer4_score=0;
        int answer5_score=0;
        int final_score=0;

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<question  number 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Boolean answer1;

        quiz1_answ3 = (RadioButton) this.findViewById(jac.com.quiz_app.R.id.question1_choice3);
      //  answer1 = quiz1_answ3.isChecked();
        if (quiz1_answ3.isChecked())
        {
        answer1_score = 1;
        }
        else
        {
         answer1_score = 0;
        }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<question  number 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        String answer2;
        quiz2_answ = (EditText) this.findViewById(jac.com.quiz_app.R.id.question2_answer);
        answer2 = quiz2_answ.getText().toString().toLowerCase();
        if (answer2.equals("1"))
        {
        answer2_score = 1;
        }
        else
        {
        answer2_score = 0;
        }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<question  number 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        quiz3_answ1 = (CheckBox) this.findViewById(jac.com.quiz_app.R.id.question3_choice1);
        quiz3_answ2 = (CheckBox) this.findViewById(jac.com.quiz_app.R.id.question3_choice2);
        quiz3_answ3 = (CheckBox) this.findViewById(jac.com.quiz_app.R.id.question3_choice3);
        answer3_choice1 = quiz3_answ1.isChecked();
        answer3_choice2 = quiz3_answ2.isChecked();
        answer3_choice3 = quiz3_answ3.isChecked();
        if (answer3_choice1 )
        {
        answer3_score = 1;
        }
        else
        {
        answer3_score = 0;
        }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<question  number 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Boolean answer4;
        question4_answer = (RadioButton) this.findViewById(jac.com.quiz_app.R.id.question4_choice2);
        answer4 = question4_answer.isChecked();
        if (answer4)
        {
        answer4_score = 1;
        }
        else
        {
        answer4_score = 0;
        }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<question  number 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        String answer5;
        question5_answer = (EditText) this.findViewById(jac.com.quiz_app.R.id.question5_answer);
        answer5 = question5_answer.getText().toString();
        if (answer5.equals("8"))
        {
        answer5_score = 1;
        }
        else
        {
        answer5_score = 0;
        }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Total score>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score ;

        if (final_score == 5)
        {
            new SweetAlertDialog(MainActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Conglaturation!")
                    .setContentText("You scored 5 out of 5")
                    .show();

        }
        else
        {

            new SweetAlertDialog(MainActivity.this, SweetAlertDialog.ERROR_TYPE)
                    .setTitleText("Test Failed !")
                    .setContentText("You scored "+ final_score +" out of 5")
                    .show();
        }


    }

}

