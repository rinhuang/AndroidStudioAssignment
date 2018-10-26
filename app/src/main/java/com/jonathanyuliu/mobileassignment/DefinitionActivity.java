package com.jonathanyuliu.mobileassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

import objects.Definition;
import objects.DefinitionAdapter;
import objects.Video;
import objects.VideoAdapter;

import static objects.Database.getDefinitionArrayList;
import static objects.Database.getVideoArrayList;
import static objects.DefinitionAdapter.getPrivatearray;

public class DefinitionActivity extends AppCompatActivity {

    EditText searchText;
    DefinitionAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        ArrayList<Definition> arrayList = getDefinitionArrayList();
        myAdapter = new DefinitionAdapter(this, arrayList);

        ListView listView = (ListView) findViewById(R.id.definitionListView);
        listView.setAdapter(myAdapter);
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Definition definition = (Definition) parent.getAdapter().getItem(position);

                Intent intent = new Intent(DefinitionActivity.this, DefinitionDetailActivity.class);
                intent.putExtra("word", definition.getWord());
                startActivity(intent);
            }
        });

        searchText = findViewById(R.id.searchText);

        searchText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                String text = searchText.getText().toString().toLowerCase(Locale.getDefault());
                myAdapter.filter(text);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    @Override
    public void onDestroy() {
        myAdapter.filter("");
        super.onDestroy();
    }
}
