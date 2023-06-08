package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  List<String> countries;
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countries= new ArrayList<>();
        countries.add("India");
        countries.add("UK");
        countries.add("USA");
        recyclerview= findViewById(R.id.recyclerview);
        MyAdapter myAdapter= new MyAdapter(this,countries);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new GridLayoutManager(this,1));


    }
}