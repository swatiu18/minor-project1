package com.example.android.myclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        TextView monday = (TextView) findViewById(R.id.mon);

// Set a click listener on that View
        monday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the MONDAY View is clicked on.
            @Override
            public void onClick(View view) {
                Intent MondayIntent = new Intent(TimeTable.this, Monday.class);
                startActivity(MondayIntent);
            }
        });
        TextView tuesday = (TextView) findViewById(R.id.tue);

// Set a click listener on that View
        tuesday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TUESDAY View is clicked on.
            @Override
            public void onClick(View view) {
                Intent TuesdayIntent = new Intent(TimeTable.this, Tuesday.class);
                startActivity(TuesdayIntent);
            }
        });
        TextView wednesday = (TextView) findViewById(R.id.wed);

// Set a click listener on that View
        wednesday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the WEDNESDAY View is clicked on.
            @Override
            public void onClick(View view) {
                Intent wedIntent = new Intent(TimeTable.this, Wednesday.class);
                startActivity(wedIntent);
            }
        });
        TextView thursday = (TextView) findViewById(R.id.thu);

// Set a click listener on that View
        thursday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the THURSDAY View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ThuIntent = new Intent(TimeTable.this, Thursday.class);
                startActivity(ThuIntent);
            }
        });
        TextView friday = (TextView) findViewById(R.id.fri);

// Set a click listener on that View
        friday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the FRIDAY View is clicked on.
            @Override
            public void onClick(View view) {
                Intent fridayIntent = new Intent(TimeTable.this, Friday.class);
                startActivity(fridayIntent);
            }
        });
        TextView saturday = (TextView) findViewById(R.id.sat);

// Set a click listener on that View
        saturday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the SATURDAY View is clicked on.
            @Override
            public void onClick(View view) {
                Intent saturdayIntent = new Intent(TimeTable.this, Saturday.class);
                startActivity(saturdayIntent);
            }
        });
    }
}