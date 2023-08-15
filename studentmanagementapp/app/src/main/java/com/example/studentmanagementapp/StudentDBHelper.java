package com.example.studentmanagementapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class StudentDBHelper extends SQLiteOpenHelper {
    public StudentDBHelper(@Nullable Context context) {
        super(context, "STUDENT_DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE Student(name TEXT,mobile TEXT,school TEXT)";
        db.execSQL(sql);
        Log.e("StudentDBHelper","onCreate()");


    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(String name, String mobile, String school) {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("name",name);
        values.put("mobile",mobile);
        values.put("school",school);
        db.insert("student",null,values);




    }
}
