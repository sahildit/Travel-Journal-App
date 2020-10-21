package com.example.prepassign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button7 = findViewById(R.id.button7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchScreen1 = new Intent(MainActivity.this, ExploreSecond.class);
                startActivity(SwitchScreen1);


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SwitchScreen2 = new Intent(MainActivity.this, AboutmeThird.class);
                startActivity(SwitchScreen2);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                Intent SwitchScreen3 = new Intent(MainActivity.this, Members.class);
                startActivity(SwitchScreen3);
            }
        });
    }
}
