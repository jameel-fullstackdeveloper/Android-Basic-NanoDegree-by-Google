package com.example.aazarjameeel.udacitymusicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        // Find the View that shows player view
        TextView player = (TextView) findViewById(R.id.textPlayList);

        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(playerIntent);
            }
          });


        // Find the View that shows the track view
        TextView track = (TextView) findViewById(R.id.textTracks);

        // Set a click listener on that View
        track.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(MainActivity.this, TrackActivity.class);
                startActivity(trackIntent);
            }
        });

        // Find the View that shows the album view
        TextView album = (TextView) findViewById(R.id.textAlbums);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the artist view
        TextView artist = (TextView) findViewById(R.id.textArtist);

        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artisIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artisIntent);
            }
        });






    }
}
