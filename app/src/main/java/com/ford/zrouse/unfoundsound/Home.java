package com.ford.zrouse.unfoundsound;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button homeButton = (Button) findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homeIntent = new Intent(Home.this, Home.class);

                startActivity(homeIntent);

            }
        });

        Button searchButton = (Button) findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent searchIntent = new Intent(Home.this, Search.class);

                startActivity(searchIntent);

            }
        });

        Button playlistsButton = (Button) findViewById(R.id.playlists_button);

        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlistsIntent = new Intent(Home.this, Playlists.class);

                startActivity(playlistsIntent);

            }
        });

        Button trendingButton = (Button) findViewById(R.id.trending_button);

        trendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent trendingIntent = new Intent(Home.this, Trending.class);

                startActivity(trendingIntent);

            }
        });
    }
}
