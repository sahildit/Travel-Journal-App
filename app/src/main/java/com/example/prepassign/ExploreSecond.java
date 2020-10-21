package com.example.prepassign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class ExploreSecond extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_second);

        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button = findViewById(R.id.button);
        Button button6 = findViewById(R.id.button6);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchScreen3 = new Intent(ExploreSecond.this, ActivitiesFourth.class);
                startActivity(SwitchScreen3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchSreen4 = new Intent(ExploreSecond.this, BeachesFiveth.class);
                startActivity(SwitchSreen4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchScreen5 = new Intent(ExploreSecond.this, Places.class);
                startActivity(SwitchScreen5);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchScreen6 = new Intent(ExploreSecond.this, AfterLocation.class);
                startActivity(SwitchScreen6);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchScreen7 = new Intent(ExploreSecond.this,AfterReview.class);
                startActivity(SwitchScreen7);
            }
        });


    }
}

