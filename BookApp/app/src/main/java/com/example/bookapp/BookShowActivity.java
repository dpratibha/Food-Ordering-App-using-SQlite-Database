package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BookShowActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    List<Book> bookList;
    BookListAdapter bookListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_show);
        recyclerview =findViewById(R.id.recyclerview);
        bookList = new ArrayList<>();
        bookListAdapter= new BookListAdapter(this,bookList);
        recyclerview.setAdapter(bookListAdapter);
        recyclerview.setLayoutManager(new GridLayoutManager(this,1));
        BookDBHelper dbHelper= new BookDBHelper(this);
        dbHelper.featchData(bookList);


    }
}