package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    List<Movie> movieList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        movieList= new ArrayList<>();
        movieList.add(new Movie("Adipurush" ,"This movie based on ramayan",50,3,"Nitin,Pratibha",R.drawable.adipurush));
        movieList.add(new Movie("Brahmastra" ,"This movie based Loard Siva",100,2,"Sachin,Rutuja",R.drawable.brahmastra));
        movieList.add(new Movie("cirkus" ,"This movie based on Test",150,3,"Ashok,Dipali",R.drawable.cirkus));
        movieList.add(new Movie("kantara" ,"This movie based on romantic",250,4,"Pooja,Ganesh",R.drawable.kantara));
        movieList.add(new Movie("tiranga" ,"This movie based on Comedy",350,4,"Vikas,Pranita",R.drawable.tiranga));

        MovieAdapter movieAdapter= new MovieAdapter(this,movieList);
        recyclerview.setAdapter(movieAdapter);
        recyclerview.setLayoutManager(new GridLayoutManager(this,1));

    }
}