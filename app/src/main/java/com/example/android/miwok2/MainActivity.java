package com.example.android.miwok2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the "Numbers" category
        final TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a click listener for the Numbers view
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find the view that shows the "Family Members" category
        TextView family = (TextView) findViewById(R.id.family);

        //Set a click listener for the Family Members view
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Family Members View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyMembersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                // Start the new activity
                startActivity(familyIntent);
            }
        });

        //Find the view that shows the "Colors" category
        TextView colors = (TextView) findViewById(R.id.colors);

        //Set a click listener for the Colors view
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Colors View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the view that shows the "Phrases" category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Set a click listener for the Phrases view
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Phrases View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                // Start the new activity
                startActivity(phrasesIntent);
            }
        });

    }

}
