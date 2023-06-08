package com.example.recycleviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<String> countries;

    public MyAdapter(Context context, List<String> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    // inflate the list which we creating in xml file
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.list_countries,null);

        return new MyViewHolder(view);
    }

    @Override
    // bind data together
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(countries.get(position));

    }

    @Override
    public int getItemCount() {
        return this.countries.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView =itemView.findViewById(R.id.textCountry);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // to get the position for view holder
            Toast.makeText(context, countries.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();

        }
    }
}
