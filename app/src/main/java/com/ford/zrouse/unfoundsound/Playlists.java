package com.ford.zrouse.unfoundsound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        Button homeButton = (Button) findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homeIntent = new Intent(Playlists.this, Home.class);

                startActivity(homeIntent);

            }
        });

        Button searchButton = (Button) findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent searchIntent = new Intent(Playlists.this, Search.class);

                startActivity(searchIntent);

            }
        });

        Button playlistsButton = (Button) findViewById(R.id.playlists_button);

        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlistsIntent = new Intent(Playlists.this, Playlists.class);

                startActivity(playlistsIntent);

            }
        });

        Button trendingButton = (Button) findViewById(R.id.trending_button);

        trendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent trendingIntent = new Intent(Playlists.this, Trending.class);

                startActivity(trendingIntent);

            }
        });
    }
}
