package com.example.prepassign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Places extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        listView = (ListView)findViewById(R.id.placeslist);// placeslist is an id which is camw from .xml file

        final String[] totalplaces = {"Dublin","Cork","Donegal","Kilkenny","Waterford","Kerry","Newbridge","Naas","Edenderry","Athlone"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,totalplaces);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mytotalplaces = totalplaces[position];
                Toast.makeText(Places.this,"You Clicked on\n" + mytotalplaces,Toast.LENGTH_LONG).show();
            }
        });


    }
}
