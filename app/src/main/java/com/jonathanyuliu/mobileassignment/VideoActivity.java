package com.jonathanyuliu.mobileassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import objects.Video;
import objects.VideoAdapter;

import static objects.Database.getVideoArrayList;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        ArrayList<Video> arrayList = getVideoArrayList();

        VideoAdapter myAdapter = new VideoAdapter(this, arrayList);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Video video = (Video) parent.getAdapter().getItem(position);

                Intent intent = new Intent(VideoActivity.this, VideoWatchActivity.class);
                intent.putExtra("video id", video.getId());
                startActivity(intent);
            }
        });
    }
}
