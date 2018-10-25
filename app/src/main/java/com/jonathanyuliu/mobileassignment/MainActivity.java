package com.jonathanyuliu.mobileassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lectureButton = findViewById(R.id.lectureButton);
        lectureButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, LectureActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button videoButton = findViewById(R.id.videoButton);
        videoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, VideoActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button definitionButton = findViewById(R.id.definitionButton);
        definitionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DefinitionActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button quizButton = findViewById(R.id.quizButton);
        quizButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, QuizActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}