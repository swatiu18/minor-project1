package com.example.android.myclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tt = (TextView) findViewById(R.id.timeTable);

        // Set a click listener on that View
        tt.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the TimeTable category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TimeTable}
                Intent TimeTableIntent = new Intent(MainActivity.this, TimeTable.class);

                // Start the new activity
                startActivity(TimeTableIntent);
            }
        });
        TextView toDo = (TextView) findViewById(R.id.toDoList);

        // Set a click listener on that View
        toDo.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the TimeTable category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TimeTable}
                Intent ToDoIntent = new Intent(MainActivity.this, ToDo.class);

                // Start the new activity
                startActivity(ToDoIntent);
            }
        });
    }
}