package com.jonathanyuliu.mobileassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import objects.Definition;
import objects.DefinitionAdapter;
import objects.Video;
import objects.VideoAdapter;

import static objects.Database.getDefinitionArrayList;
import static objects.Database.getVideoArrayList;

public class DefinitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        ArrayList<Definition> arrayList = getDefinitionArrayList();
        DefinitionAdapter myAdapter = new DefinitionAdapter(this, arrayList);

        ListView listView = (ListView) findViewById(R.id.definitionListView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Definition definition = (Definition) parent.getAdapter().getItem(position);

                Intent intent = new Intent(DefinitionActivity.this, DefinitionDetailActivity.class);
                intent.putExtra("word", definition.getWord());
                startActivity(intent);
            }
        });
    }
}
