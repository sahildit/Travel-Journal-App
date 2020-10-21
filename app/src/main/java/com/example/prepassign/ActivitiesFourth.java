package com.example.prepassign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActivitiesFourth extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_fourth);

        listView = (ListView)findViewById(R.id.activitieslist);

        final String[] activites = {"Incognito Escape Room","Adventure Rooms","Castlefergus Eqestrian","Escape Boats","3D Archery","Comedy Club","Awesome Walls"};
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,activites);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String myactivities = activites[position];

                Toast.makeText(ActivitiesFourth.this,"You clicked\n" + myactivities,Toast.LENGTH_LONG).show();

            }
        });





    }
}
