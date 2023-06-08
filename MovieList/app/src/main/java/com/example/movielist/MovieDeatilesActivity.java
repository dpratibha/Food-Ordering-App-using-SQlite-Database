package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDeatilesActivity extends AppCompatActivity {
    ImageView image;
    TextView textName, textDesc, textCast, textRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_deatiles);
        textName = findViewById(R.id.textName);
        textCast = findViewById(R.id.textCast);
        textRating = findViewById(R.id.textRating);
        Intent intent = getIntent();
        Movie movie = (Movie) intent.getSerializableExtra("movie");
        image.setImageResource(movie.getImage());
        textName.setText("Name : " + movie.getName());
        textCast.setText("Cast : " + movie.getCast());
        textRating.setText("Rating : " + movie.getRating());


    }
}