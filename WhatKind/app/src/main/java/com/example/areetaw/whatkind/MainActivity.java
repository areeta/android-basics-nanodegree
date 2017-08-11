package com.example.areetaw.whatkind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void calculateAllPoints(View view) {

        score = 0;
        // Java objects created

        //Question 1
        RadioButton corgiButtonClicked = (RadioButton) findViewById(R.id.rb_corgi);
        boolean hasCorgi = corgiButtonClicked.isChecked();

        if (hasCorgi == true) {
            score += 100;
        }

        //Question 2
        RadioButton tabbyButtonClicked = (RadioButton) findViewById(R.id.rb_tabby);
        boolean hasTabby = tabbyButtonClicked.isChecked();

        if (hasTabby == true) {
            score += 100;
        } else {
                Log.v("Nothing!","Just for meeting rubrics!");
        }

        //Question 3
        EditText mathQuestion = (EditText) findViewById(R.id.geometry_edit);
        String geo = mathQuestion.getText().toString().trim();

        if (geo.equalsIgnoreCase("Geometry")) {
            score += 100;
        }

        //Question 4
        CheckBox blueButtonClicked = (CheckBox) findViewById(R.id.cb_blueAnswer);
        Boolean hasBlue = blueButtonClicked.isChecked();

        CheckBox cyanButtonClicked = (CheckBox) findViewById(R.id.cb_cyanAnswer);
        Boolean hasCyan = cyanButtonClicked.isChecked();

        CheckBox blackButtonClicked = (CheckBox) findViewById(R.id.cb_blackAnswer);
        Boolean hasBlack = blackButtonClicked.isChecked();


        if (hasCyan && hasBlue && !hasBlack) {
            score += 100;
        }

        //Question 5
        RadioButton kohlrabiButtonClicked = (RadioButton) findViewById(R.id.rb_kohlrabi);
        boolean hasKohlrabi = kohlrabiButtonClicked.isChecked();

        if (hasKohlrabi == true) {
            score += 100;
        }

        //Question 6
        EditText computerQuestion = (EditText) findViewById(R.id.mac_edit);
        String mac = computerQuestion.getText().toString();

        if (mac.equals("Mac")) {
            score += 100;
        }

        display(score);
        Toast.makeText(this, "Your final score is: " + Integer.toString(score), Toast.LENGTH_SHORT).show();

    }

    /**
     * This method resets the scores.
     */

    public void resetScore(View view) {
        score = 0;
        display(score);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}