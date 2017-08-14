package com.example.areetaw.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class CurrentSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        // Find the View that shows the current song category
        ImageButton currentSong = (ImageButton) findViewById(R.id.menu_button);

        // Set a click listener on that View
        currentSong.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the current song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(CurrentSong.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
