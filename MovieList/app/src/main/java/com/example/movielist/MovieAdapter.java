package com.example.movielist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    Context context;
    List<Movie> movieList;

    public MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }


    @NonNull
    @Override

    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.movie_list,null);
        return new MyViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
       // get object from movie object from arraylist and set with specific data
        Movie movie=movieList.get(position);
        holder.image.setImageResource(movie.getImage());
        holder.textName.setText("Name :" +movie.getName());
        holder.textPrice.setText("Price :" +movie.getPrice());


    }

    @Override
    public int getItemCount() {
        return this.movieList.size();
    }
    public  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView image;
        TextView textName,textPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.image);
            textName= itemView.findViewById(R.id.textName);
            textPrice=itemView.findViewById(R.id.textPrice);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Movie movie= movieList.get(getAdapterPosition());
            Intent intent= new Intent(context,MovieDeatilesActivity.class);
            intent.putExtra("movei",movie);
            context.startActivity(intent);


        }
    }
}
