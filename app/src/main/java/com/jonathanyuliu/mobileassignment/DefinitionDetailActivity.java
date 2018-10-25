package com.jonathanyuliu.mobileassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import objects.Definition;

import static objects.Database.getDefinitionByWord;

public class DefinitionDetailActivity extends AppCompatActivity {
    public String word;
    public String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition_detail);

        word = getIntent().getStringExtra("word");
        Definition definition = getDefinitionByWord(word);

        TextView wordView = findViewById(R.id.wordView);
        TextView wordDescriptionView = findViewById(R.id.wordDescriptionView);

        wordView.setText(definition.getWord());
        wordDescriptionView.setText(definition.getDescription());
    }
}
