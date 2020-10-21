package com.example.prepassign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BeachesFiveth extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches_fiveth);

        listView = (ListView)findViewById(R.id.beachlists);

         final String[] Places = {"Main Beach Donegal","KIlliney Strand", "Coumeenole Beach","Portstewart Strand","Inchydoney Beach","Keem Beach","Dog's Bay & Gurteen Bay","Portsalon Beach","Inch Beach","Murlough Beach"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Places);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String myPlaces = Places[position];

                Toast.makeText(BeachesFiveth.this,"You clicked\n" + myPlaces,Toast.LENGTH_LONG).show();
            //    Intent intent = new  Intent();
            }
        });

     }
}
