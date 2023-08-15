package com.example.bookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.MyViewHolder> {
    Context context;
    List<Book> bookList;

    public BookListAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view=  LayoutInflater.from(context).inflate(R.layout.book_lis,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookListAdapter.MyViewHolder holder, int position) {
        holder.textName.setText("Name: "+ this.bookList.get(position).getBookName());
        holder.textAuthor.setText("Author: "+this.bookList.get(position).getAuthor());
        holder.textType.setText("Type : "+this.bookList.get(position).getType());
        holder.textPrice.setText( "price: "+""+this.bookList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return this.bookList.size();
    }
   class MyViewHolder extends RecyclerView.ViewHolder{
       TextView textName,textAuthor,textType,textPrice;
       public MyViewHolder(@NonNull View itemView) {

           super(itemView);
           textName = itemView.findViewById(R.id.textName);
           textAuthor = itemView.findViewById(R.id.textAuthor);
           textType = itemView.findViewById(R.id.textType);
           textPrice = itemView.findViewById(R.id.textPrice);


       }
   }
}
