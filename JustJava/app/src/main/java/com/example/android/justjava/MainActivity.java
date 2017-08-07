package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // Java object created

        CheckBox whippedCreamCheckbox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckbox.isChecked();

        CheckBox chocolateCheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckbox.isChecked();

        EditText nameInput = (EditText) findViewById(R.id.name_field);
        Editable hasNameInput = nameInput.getText();
        // String name = nameField.getText().toString(); = chaining methods

       // Log.v("MainActivity", "Has whipped cream: " + hasWhippedCream);

        int price = calculatePrice(hasWhippedCream, hasChocolate);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_TEXT, createOrderSummary(price, hasWhippedCream, hasChocolate, hasNameInput));
        intent.putExtra(Intent.EXTRA_SUBJECT, "JustJava Order for " + hasNameInput);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * This method is called when the order summary is called from submitOrder method.
     *
     * @param orderPrice
     * @param addWhippedCream is whether or not the user wants whipped cream topping
     * @param addChocolate is whether or not the user wants chocolate topping
     * @param addName is the name of the buyer
     * @return text summary
     *
     */

    private String createOrderSummary(int orderPrice, boolean addWhippedCream, boolean addChocolate, Editable addName) {

        String message =
                        "Name: " + addName +
                        "\nAdd whipped cream? " + addWhippedCream +
                        "\nAdd chocolate? " + addChocolate +
                        "\nQuantity: " + numberOfCoffees +
                        "\nTotal: $" + (orderPrice)+
                        "\nThank you!";
        return message;
    }

    /**
     * Calculates the price of the order.
     * @param addWhippedCream checks whether there is whipped cream or not
     * @param addChocolate checks whether there is chocolate or not
     * @return total price
     */
    private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
        // Price of one cup of coffee
        int basePrice = 5;

        // Adds $1 if user wants whipped cream
        if (addWhippedCream == true) {
            basePrice += 1;
        }

        // Adds $2 if user wants whipped cream
        if (addChocolate == true) {
            basePrice += 2;
        }

        // Multiplies the price of one coffee by the user's desired amount of cups
        return basePrice * numberOfCoffees;
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        if (numberOfCoffees == 99) {
            // Shows an error message as a toast
            Toast.makeText(this, "You can't buy more than 100 cups of coffee!", Toast.LENGTH_SHORT).show();
            return;
        }
        numberOfCoffees += 1;
        display(numberOfCoffees);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        if (numberOfCoffees == 1) {
            // Shows an error message as a toast
            Toast.makeText(this, "You can't buy less than 0 cups of coffee!", Toast.LENGTH_SHORT).show();
            return;
        }
        numberOfCoffees -= 1;
        display(numberOfCoffees);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


}

