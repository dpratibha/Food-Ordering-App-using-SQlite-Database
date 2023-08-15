package com.example.bookapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.List;

public class BookDBHelper extends SQLiteOpenHelper {
    public BookDBHelper(@Nullable Context context) {

        super(context, "book_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql= "CREATE TABLE BOOK (bookName TEXT,author TEXT,type TEXT, price INT)";
        db.execSQL(sql);
        Log.e("BookDBHelper","onCreate()");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertBook(String name, String author, String type, int price) {
    SQLiteDatabase db=getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("bookName" ,name);
        values.put("author" ,author);
        values.put("type" ,type);
        values.put("price" ,price);
        db.insert("book",null,values);


    }

    public void featchData(List<Book> bookList) {
    SQLiteDatabase db= getReadableDatabase();
        Cursor cursor= db.query("book",null,null,null,null,null,null,null);
        while (cursor.moveToNext()){
        String name=cursor.getString(0);
        String author=cursor.getString(1);
        String type= cursor.getString(2);
        int price= cursor.getInt(3);
        Book book= new Book(name,author,type,price);
        bookList.add(book);

        }


    }
}
