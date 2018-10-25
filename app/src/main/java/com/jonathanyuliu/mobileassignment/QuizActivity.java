package com.jonathanyuliu.mobileassignment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import objects.Question;
import static objects.Database.getQuestionArrayList;

public class QuizActivity extends AppCompatActivity {

    TextView questionView;
    RadioButton radioA;
    RadioButton radioB;
    RadioButton radioC;
    RadioButton radioD;
    Button checkButton;
    Button nextButton;
    TextView questionNumberView;
    TextView checkAlertView;
    ArrayList<Question> arrayList;
    RadioGroup radioGroup;
    Button backButton;

    int questionNumber = 1;
    Question question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionView = findViewById(R.id.questionView);
        radioA = findViewById(R.id.radio_a);
        radioB = findViewById(R.id.radio_b);
        radioC = findViewById(R.id.radio_c);
        radioD = findViewById(R.id.radio_d);
        nextButton = findViewById(R.id.nextButton);
        backButton = findViewById(R.id.backButton);
        checkButton = findViewById(R.id.checkButton);
        questionNumberView = findViewById(R.id.questionNumberView);
        checkAlertView = findViewById(R.id.checkAlertView);
        radioGroup = findViewById(R.id.radioGroup);

        arrayList = getQuestionArrayList();
        setupQuestion(questionNumber);

        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (questionNumber == 1) {
                    questionNumber = arrayList.size();
                }
                else {
                    questionNumber--;
                }
                setupQuestion(questionNumber);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (questionNumber == arrayList.size()) {
                    questionNumber = 1;
                }
                else {
                    questionNumber++;
                }
                setupQuestion(questionNumber);
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                radioA.setTextColor(Color.BLACK);
                radioB.setTextColor(Color.BLACK);
                radioC.setTextColor(Color.BLACK);
                radioD.setTextColor(Color.BLACK);

                String answerChoice = "";
                String radioChoice = "";

                //Check which answer is selected
                if(radioA.isChecked()){
                    answerChoice = radioA.getText().toString();
                    radioChoice = "radioA";
                }
                else if(radioB.isChecked()){
                    answerChoice = radioB.getText().toString();
                    radioChoice = "radioB";
                }
                else if(radioC.isChecked()){
                    answerChoice = radioC.getText().toString();
                    radioChoice = "radioC";
                }
                else if(radioD.isChecked()){
                    answerChoice = radioD.getText().toString();
                    radioChoice = "radioD";
                }
                else {
                }

                //Check if answer is correct
                //If correct, mark answerChoice as green
                if(question.isCorrect(answerChoice)) {
                    checkAlertView.setText("Correct");
                    if(radioChoice.equals("radioA")){
                        radioA.setTextColor(Color.GREEN);
                    }
                    else if(radioChoice.equals("radioB")){
                        radioB.setTextColor(Color.GREEN);
                    }
                    else if(radioChoice.equals("radioC")){
                        radioC.setTextColor(Color.GREEN);
                    }
                    else if(radioChoice.equals("radioD")){
                        radioD.setTextColor(Color.GREEN);
                    }
                    checkAlertView.setTextColor(Color.GREEN);
                }
                //If incorrect, mark answerChoice as red
                else if(!question.isCorrect(answerChoice)){
                    checkAlertView.setText("Incorrect");
                    if(radioChoice.equals("radioA")){
                        radioA.setTextColor(Color.RED);
                    }
                    else if(radioChoice.equals("radioB")){
                        radioB.setTextColor(Color.RED);
                    }
                    else if(radioChoice.equals("radioC")){
                        radioC.setTextColor(Color.RED);
                    }
                    else if(radioChoice.equals("radioD")){
                        radioD.setTextColor(Color.RED);
                    }
                    checkAlertView.setTextColor(Color.RED);
                }
                checkAlertView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void setupQuestion(int questionNumber) {
        question = arrayList.get(questionNumber - 1);

        questionNumberView.setText("Question " + questionNumber + " of " + arrayList.size());
        radioA.setTextColor(Color.BLACK);
        radioB.setTextColor(Color.BLACK);
        radioC.setTextColor(Color.BLACK);
        radioD.setTextColor(Color.BLACK);
        radioGroup.clearCheck();
        checkAlertView.setVisibility(View.INVISIBLE);
        questionView.setText(question.getQuestion());
        radioA.setText(question.getOptionA());
        radioB.setText(question.getOptionB());
        radioC.setText(question.getOptionC());
        radioD.setText(question.getOptionD());
    }
}
