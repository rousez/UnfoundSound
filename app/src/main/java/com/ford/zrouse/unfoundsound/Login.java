package com.ford.zrouse.unfoundsound;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button loginHomeButton = (Button) findViewById(R.id.login_home_button);

        loginHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loginHomeIntent = new Intent(Login.this, Home.class);

                startActivity(loginHomeIntent);

            }
        });


    }
}
