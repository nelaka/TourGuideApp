package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the where to eat category
        TextView toeat = (TextView) findViewById(R.id.toeat);
        // Set a clickListener on that View
        toeat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link WhereToEatActivity}
                Intent toeatIntent = new Intent(MainActivity.this, WhereToEatActivity.class);
                //Start the new activity
                startActivity(toeatIntent);
            }
        });

        //Find the View that shows the where to go category
        TextView togo = (TextView) findViewById(R.id.togo);
        // Set a clickListener on that View
        togo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link WhereToGoActivity}
                Intent togoIntent = new Intent(MainActivity.this, WhereToGoActivity.class);
                //Start the new activity
                startActivity(togoIntent);
            }
        });

        //Find the View that shows the where to see category
        TextView tosee = (TextView) findViewById(R.id.tosee);
        // Set a clickListener on that View
        tosee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link WhereToSeeActivity}
                Intent toseeIntent = new Intent(MainActivity.this, WhereToSeeActivity.class);
                //Start the new activity
                startActivity(toseeIntent);
            }
        });

        //Find the View that shows the where to sleep category
        TextView tosleep = (TextView) findViewById(R.id.tosleep);
        // Set a clickListener on that View
        tosleep.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link WhereToSleepActivity}
                Intent tosleepIntent = new Intent(MainActivity.this, WhereToSleepActivity.class);
                //Start the new activity
                startActivity(tosleepIntent);
            }
        });

    }
}
