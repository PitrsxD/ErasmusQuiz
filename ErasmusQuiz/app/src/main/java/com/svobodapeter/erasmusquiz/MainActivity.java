package com.svobodapeter.erasmusquiz;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    int scoreNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //** Maybe better to use bindingData function?
        RelativeLayout layoutIntro = findViewById(R.id.relative_intro);
        layoutIntro.setVisibility(View.VISIBLE);
        RelativeLayout layoutQuestion1 = findViewById(R.id.relative_question1);
        layoutQuestion1.setVisibility(View.GONE);
        RelativeLayout layoutQuestion2 = findViewById(R.id.relative_question2);
        layoutQuestion2.setVisibility(View.GONE);
        RelativeLayout layoutQuestion3 = findViewById(R.id.relative_question3);
        layoutQuestion3.setVisibility(View.GONE);
        RelativeLayout layoutQuestion4 = findViewById(R.id.relative_question4);
        layoutQuestion4.setVisibility(View.GONE);
        RelativeLayout layoutQuestion5 = findViewById(R.id.relative_question5);
        layoutQuestion5.setVisibility(View.GONE);
        RelativeLayout layoutQuestion6 = findViewById(R.id.relative_question6);
        layoutQuestion6.setVisibility(View.GONE);
        TextView rightAnswerText1 = findViewById(R.id.right_answer1);
        rightAnswerText1.setVisibility(View.GONE);
        TextView rightAnswerText2 = findViewById(R.id.right_answer2);
        rightAnswerText2.setVisibility(View.GONE);
        TextView rightAnswerText3 = findViewById(R.id.right_answer3);
        rightAnswerText3.setVisibility(View.GONE);
        TextView rightAnswerText4 = findViewById(R.id.right_answer4);
        rightAnswerText4.setVisibility(View.GONE);
        TextView rightAnswerText5 = findViewById(R.id.right_answer5);
        rightAnswerText5.setVisibility(View.GONE);
        TextView rightAnswerText6 = findViewById(R.id.right_answer6);
        rightAnswerText6.setVisibility(View.GONE);
        RelativeLayout layoutEnd = findViewById(R.id.relative_end);
        layoutEnd.setVisibility(View.GONE);
        TextView scoreText = findViewById(R.id.score_text);
        scoreText.setVisibility(View.GONE);
        TextView summaryName = findViewById(R.id.summary_name);
        summaryName.setVisibility(View.GONE);
    }

    //**Button - Will memorize the name of user and start the quiz
    public void startQuiz(View view) {
        RelativeLayout layoutIntro = findViewById(R.id.relative_intro);
        RelativeLayout layoutQuestion1 = findViewById(R.id.relative_question1);
        TextView scoreText = findViewById(R.id.score_text);
        layoutIntro.setVisibility(View.GONE);
        layoutQuestion1.setVisibility(View.VISIBLE);
        scoreText.setVisibility(View.VISIBLE);
        TextView scoreNumberView = findViewById(R.id.score_number);
        scoreNumberView.setVisibility(View.VISIBLE);
        displayScoreNumber(scoreNumber);
    }

    //** Button - will submit answer on question, calculate score, show right answer and reset buttons for answer
    public void submit1(View view) {
        Button rightAnswerButton1 = findViewById(R.id.submit_answer1);
        rightAnswerButton1.setVisibility(View.GONE);
        TextView rightAnswer1 = findViewById(R.id.right_answer1);
        rightAnswer1.setVisibility(View.VISIBLE);
        RadioButton rba3 = findViewById(R.id.question1_a3_id);
        if (rba3.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        displayScoreNumber(scoreNumber);
        RadioButton rba1 = findViewById(R.id.question1_a1_id);
        rba1.setChecked(false);
        RadioButton rba2 = findViewById(R.id.question1_a2_id);
        rba2.setChecked(false);
        rba3.setChecked(false);
    }

    //**Button - will hide this question and show new one
    public void answer1(View view) {
        TextView rightAnswerText1 = findViewById(R.id.right_answer1);
        RelativeLayout layoutQuestion1 = findViewById(R.id.relative_question1);
        RelativeLayout layoutQuestion2 = findViewById(R.id.relative_question2);
        rightAnswerText1.setVisibility(View.GONE);
        layoutQuestion1.setVisibility(View.GONE);
        layoutQuestion2.setVisibility(View.VISIBLE);

    }

    //** Button - will submit answer on question, calculate score and show right answer
    public void submit2(View view) {
        Button rightAnswerButton2 = findViewById(R.id.submit_answer2);
        rightAnswerButton2.setVisibility(View.GONE);
        TextView rightAnswer2 = findViewById(R.id.right_answer2);
        rightAnswer2.setVisibility(View.VISIBLE);
        RadioButton rba2 = findViewById(R.id.question2_a2_id);
        if (rba2.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        displayScoreNumber(scoreNumber);
        RadioButton rba1 = findViewById(R.id.question2_a1_id);
        rba1.setChecked(false);
        rba2.setChecked(false);
    }

    //**Button - will hide this question and show new one
    public void answer2(View view) {
        TextView rightAnswerText2 = findViewById(R.id.right_answer2);
        RelativeLayout layoutQuestion2 = findViewById(R.id.relative_question2);
        RelativeLayout layoutQuestion3 = findViewById(R.id.relative_question3);
        layoutQuestion2.setVisibility(View.GONE);
        layoutQuestion3.setVisibility(View.VISIBLE);
        rightAnswerText2.setVisibility(View.GONE);
    }

    //** Button - will submit answer on question, calculate score and show right answer
    public void submit3(View view) {
        Button rightAnswerButton3 = findViewById(R.id.submit_answer3);
        rightAnswerButton3.setVisibility(View.GONE);
        TextView rightAnswer3 = findViewById(R.id.right_answer3);
        rightAnswer3.setVisibility(View.VISIBLE);
        RadioButton rba3 = findViewById(R.id.question3_a3_id);
        if (rba3.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        displayScoreNumber(scoreNumber);
        RadioButton rba1 = findViewById(R.id.question3_a1_id);
        rba1.setChecked(false);
        RadioButton rba2 = findViewById(R.id.question3_a2_id);
        rba2.setChecked(false);
        rba3.setChecked(false);
    }

    //**Button - will hide this question and show new one
    public void answer3(View view) {
        TextView rightAnswerText3 = findViewById(R.id.right_answer3);
        RelativeLayout layoutQuestion3 = findViewById(R.id.relative_question3);
        RelativeLayout layoutQuestion4 = findViewById(R.id.relative_question4);
        layoutQuestion3.setVisibility(View.GONE);
        layoutQuestion4.setVisibility(View.VISIBLE);
        rightAnswerText3.setVisibility(View.GONE);

    }

    //** Button - will submit answer on question, calculate score and show right answer
    public void submit4(View view) {
        Button rightAnswerButton4 = findViewById(R.id.submit_answer4);
        rightAnswerButton4.setVisibility(View.GONE);
        TextView rightAnswer4 = findViewById(R.id.right_answer4);
        rightAnswer4.setVisibility(View.VISIBLE);
        RadioButton rba1 = findViewById(R.id.question4_a1_id);
        if (rba1.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        displayScoreNumber(scoreNumber);
        rba1.setChecked(false);
        RadioButton rba2 = findViewById(R.id.question4_a2_id);
        rba2.setChecked(false);
    }

    //**Button - will hide this question and show new one
    public void answer4(View view) {
        TextView rightAnswerText4 = findViewById(R.id.right_answer4);
        RelativeLayout layoutQuestion4 = findViewById(R.id.relative_question4);
        RelativeLayout layoutQuestion5 = findViewById(R.id.relative_question5);
        layoutQuestion4.setVisibility(View.GONE);
        layoutQuestion5.setVisibility(View.VISIBLE);
        rightAnswerText4.setVisibility(View.GONE);
    }

    //** Button - will submit answer on question, calculate score and show right answer
    public void submit5(View view) {
        Button rightAnswerButton5 = findViewById(R.id.submit_answer5);
        rightAnswerButton5.setVisibility(View.GONE);
        TextView rightAnswer5 = findViewById(R.id.right_answer5);
        rightAnswer5.setVisibility(View.VISIBLE);
        CheckBox rba5a = findViewById(R.id.question5_checkbox1);
        CheckBox rba5b = findViewById(R.id.question5_checkbox2);
        CheckBox rba5c = findViewById(R.id.question5_checkbox3);
        CheckBox rba5d = findViewById(R.id.question5_checkbox4);
        if (rba5a.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        if (rba5b.isChecked()) {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        } else {
        }
        if (rba5c.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        if (rba5d.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        displayScoreNumber(scoreNumber);
        rba5a.setChecked(false);
        rba5b.setChecked(false);
        rba5c.setChecked(false);
        rba5d.setChecked(false);
    }

    //**Button - will hide this question and show new one
    public void answer5(View view) {
        TextView rightAnswerText5 = findViewById(R.id.right_answer5);
        RelativeLayout layoutQuestion5 = findViewById(R.id.relative_question5);
        RelativeLayout layoutQuestion6 = findViewById(R.id.relative_question6);
        layoutQuestion5.setVisibility(View.GONE);
        layoutQuestion6.setVisibility(View.VISIBLE);
        rightAnswerText5.setVisibility(View.GONE);

    }

    //** Button - will submit answer on question, calculate score and show right answer
    public void submit6(View view) {
        Button rightAnswerButton6 = findViewById(R.id.submit_answer6);
        rightAnswerButton6.setVisibility(View.GONE);
        TextView rightAnswer6 = findViewById(R.id.right_answer6);
        rightAnswer6.setVisibility(View.VISIBLE);
        RadioButton rba1 = findViewById(R.id.question6_a2_id);
        if (rba1.isChecked()) {
            scoreNumber = scoreNumber + 1;
        } else {
            Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
        }
        displayScoreNumber(scoreNumber);
        RadioButton rba2 = findViewById(R.id.question6_a1_id);
        rba1.setChecked(false);
        rba2.setChecked(false);
    }

    //** Button - will submit answer on question, calculate score and show right answer
    public void answer6(View view) {
        TextView rightAnswerText6 = findViewById(R.id.right_answer6);
        RelativeLayout layoutQuestion6 = findViewById(R.id.relative_question6);
        RelativeLayout layoutEnd = findViewById(R.id.relative_end);
        layoutQuestion6.setVisibility(View.GONE);
        layoutEnd.setVisibility(View.VISIBLE);
        rightAnswerText6.setVisibility(View.GONE);
        displayName (view);
        TextView summaryName = findViewById(R.id.summary_name);
        summaryName.setVisibility(View.VISIBLE);
    }

    //** Method will display the name of user in TextView
    public void displayName (View view){
        EditText nameID = findViewById(R.id.name);
        String nameIDset = nameID.getText().toString();
        TextView nameIDview = findViewById(R.id.summary_name);
        nameIDview.setText(nameIDset);
    }

    //** Button - will reset visibility, score and name
    public void reset(View view) {
        RelativeLayout layoutEnd = findViewById(R.id.relative_end);
        RelativeLayout layoutIntro = findViewById(R.id.relative_intro);
        layoutEnd.setVisibility(View.GONE);
        layoutIntro.setVisibility(View.VISIBLE);
        TextView scoreText = findViewById(R.id.score_text);
        scoreText.setVisibility(View.GONE);
        TextView scoreNumberView = findViewById(R.id.score_number);
        scoreNumberView.setVisibility(View.GONE);
        scoreNumber = 0;
        displayScoreNumber(scoreNumber);
        Button rightAnswerButton1 = findViewById(R.id.submit_answer1);
        rightAnswerButton1.setVisibility(View.VISIBLE);
        Button rightAnswerButton2 = findViewById(R.id.submit_answer2);
        rightAnswerButton2.setVisibility(View.VISIBLE);
        Button rightAnswerButton3 = findViewById(R.id.submit_answer3);
        rightAnswerButton3.setVisibility(View.VISIBLE);
        Button rightAnswerButton4 = findViewById(R.id.submit_answer4);
        rightAnswerButton4.setVisibility(View.VISIBLE);
        Button rightAnswerButton5 = findViewById(R.id.submit_answer5);
        rightAnswerButton5.setVisibility(View.VISIBLE);
        Button rightAnswerButton6 = findViewById(R.id.submit_answer6);
        rightAnswerButton6.setVisibility(View.VISIBLE);
        TextView summaryName = findViewById(R.id.summary_name);
        summaryName.setVisibility(View.GONE);
        EditText nameID = findViewById(R.id.name);
        nameID.setText(null);
            }

            //** Method will display actual score in TextView
    public void displayScoreNumber(int scoreNumber) {
        TextView displayNumber = findViewById(R.id.score_number);
        displayNumber.setText("" + scoreNumber);
    }

}

