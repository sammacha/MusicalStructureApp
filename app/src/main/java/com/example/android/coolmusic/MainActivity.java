package com.example.android.coolmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent playingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playingIntent);
            }
        });

        // create a list of songs
        ArrayList<Songs> albums = new ArrayList<Songs>();
        albums.add(new Songs("God's Plan","Drake"));
        albums.add(new Songs("Perfect","Ed Sheeran"));
        albums.add(new Songs("Shape of you","Ed Sheeran"));
        albums.add(new Songs("Burn","Ellie Goulding"));
        albums.add(new Songs("Let it go","Frozen"));
        albums.add(new Songs("Happy Birthday","Harmonize"));
        albums.add(new Songs("Rise","Katty Perry"));
        albums.add(new Songs("Cheza Chini","King Kaka"));
        albums.add(new Songs("Seven Years","Lucas Graham"));
        albums.add(new Songs("let her go!","Passenger"));
        albums.add(new Songs("Kuliko Jana","Sauti Sol"));
        albums.add(new Songs("Never Give up","Sia"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.

        SongAdapter sAdapter = new SongAdapter(this,albums);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(sAdapter);
    }
}
