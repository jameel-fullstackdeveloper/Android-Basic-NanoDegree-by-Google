package com.example.aazarjameeel.hyderabadtourguideapp;

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

        // Find the View that shows the event category
        TextView events = (TextView) findViewById(R.id.text_event);

        // Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent eventsIntent = new Intent(MainActivity.this, Event.class);

                // Start the new activity
                startActivity(eventsIntent);
            }
        });


        // Find the View that shows the marriage hall category
        TextView marriagehalls = (TextView) findViewById(R.id.text_marriagehall);

        // Set a click listener on that View
        marriagehalls.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent marriagehallsIntent = new Intent(MainActivity.this, MarriageHall.class);

                // Start the new activity
                startActivity(marriagehallsIntent);
            }
        });


        // Find the View that shows the marriage hall category
        TextView restaurantshalls = (TextView) findViewById(R.id.text_restaurant);

        // Set a click listener on that View
        restaurantshalls.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurant.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the marriage hall category
        TextView schools = (TextView) findViewById(R.id.text_school);

        // Set a click listener on that View
        schools.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent schoolsIntent = new Intent(MainActivity.this, School.class);

                // Start the new activity
                startActivity(schoolsIntent);
            }
        });


    }
}
