package com.example.areetaw.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the current song category
        Button currentSong = (Button) findViewById(R.id.current_song);

        // Set a click listener on that View
        currentSong.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the current song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, CurrentSong.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the music library category
        Button musicLibrary = (Button) findViewById(R.id.music_library);

        // Set a click listener on that View
        musicLibrary.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the music library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, MusicLibrary.class);
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the payment category
        Button payment = (Button) findViewById(R.id.payment);

        // Set a click listener on that View
        payment.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the payment button View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Payment.class);
                startActivity(colorsIntent);
            }
        });
    }
}
