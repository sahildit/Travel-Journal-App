package com.example.prepassign;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.TextView;

public class DataBaseHelper extends SQLiteOpenHelper {


    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "TEST.db", null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

       sqLiteDatabase.execSQL("CREATE TABLE STUDENTS( ID INTEGER PRIMARY KEY AUTOINCREMENT, FIRSTNAME TEXT UNIQUE, LASTNAME TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS STUDENTS;");
    }

    public void insert_student(String first_name, String last_name){
        ContentValues Values = new ContentValues();
        Values.put("FIRSTNAME",first_name);
        Values.put("LASTNAME",last_name);
        this.getWritableDatabase().insertOrThrow("STUDENTS","",Values);

    }

    public void delete_student(String first_name) {
        this.getWritableDatabase().delete("STUDENTS", "FIRSTNAME='" + first_name + "'", null);
    }

    public void update_student(String old_first_name, EditText new_first_name){
        this.getWritableDatabase().execSQL("UPDATE STUDENTS SET FIRSTNAME='" + new_first_name + "' WHERE FIRSTNAME='" + old_first_name);
    }

    public void list_all_students(TextView textView){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM STUDENTS",null);
        textView.setText("");
        while(cursor.moveToNext()){
            textView.append(cursor.getString(1) + " " +cursor.getString(2)+"\n");

        }
    }
}