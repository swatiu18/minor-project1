package com.example.android.myclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Friday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture_list);
        ArrayList<lecture> lectures=new ArrayList<lecture>();
        lectures.add(new lecture("OS LECT", "9-9:50 AM", "118A", "NRJ"));
        lectures.add(new lecture("COA LECT", "10-10:50 AM", "118A", "KTR"));
        lectures.add(new lecture("OS LAB", "11-12:50 PM", "117", "RJP"));
        lectures.add(new lecture("BIG DATA LECT", "3-3:50 PM", "117", "NRJ"));
        lectures.add(new lecture("SOCIOLOGY OF MEDIA TUT", "4-4:50 PM", "118A", "PRIYANKA"));
        lectures.add(new lecture("FINANCIAL MANAGEMENT", "4-4:50 PM", "117", "SKVA"));
        lectureAdapter adapter = new lectureAdapter(this, lectures);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                lecture lec = lectures.get(i);
            }
        });
    }

}