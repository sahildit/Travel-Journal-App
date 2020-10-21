// did'nt use textview for .xml file so can't print stuff at the
// moment


package com.example.prepassign;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Members extends AppCompatActivity {
    EditText first_name,last_name;
    TextView textView;
    DataBaseHelper dataBaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        first_name = (EditText)findViewById(R.id.first_name);
        last_name = (EditText)findViewById(R.id.last_name);
        textView = (TextView)findViewById(R.id.textView);

        dataBaseHelper  = new DataBaseHelper(this,"",null,1);

    }

    public void button_click(View view) {
        switch (view.getId()){
            // for add
            case R.id.button8:
                try {
                    dataBaseHelper.insert_student(first_name.getText().toString(),last_name.getText().toString());
                }catch(SQLiteException e){
                    Toast.makeText(Members.this,"ALREADY EXISTS", Toast.LENGTH_SHORT).show();
                }
                break;
            // for delete
            case R.id.button10:
                dataBaseHelper.delete_student(first_name.getText().toString());
                break;
            // for update
            case R.id.button9:
                AlertDialog.Builder dialog = new AlertDialog.Builder(Members.this);
                dialog.setTitle("ENTER NEW FIRSTNAME ");

                final EditText new_first_name = new EditText(this);
                dialog.setView(new_first_name);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dataBaseHelper.update_student(first_name.getText().toString(),new_first_name);
                    }
                });
                dialog.show();

                break;
            // for total members
            case  R.id.button11:
                dataBaseHelper.list_all_students(textView);

                break;


        }
    }
}
