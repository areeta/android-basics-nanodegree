package com.example.areetaw.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Find the View that shows the menu category
        ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

        // Set a click listener on that View
        menu.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the current song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Payment.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
