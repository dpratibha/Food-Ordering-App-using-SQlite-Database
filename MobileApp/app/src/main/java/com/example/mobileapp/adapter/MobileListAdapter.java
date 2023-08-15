package com.example.mobileapp.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mobileapp.R;
import com.example.mobileapp.activity.DetailsActivity;
import com.example.mobileapp.entity.Mobile;
import com.example.mobileapp.util.API;

import java.util.List;

public class MobileListAdapter extends RecyclerView.Adapter<MobileListAdapter.MyViewHolder> {

    Context context;
    List<Mobile> mobileList;

    public MobileListAdapter(Context context, List<Mobile> mobileList) {
        this.context = context;
        this.mobileList = mobileList;
    }
    @NonNull
    @Override
    public MobileListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mobile_list,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileListAdapter.MyViewHolder holder, int position) {
        Mobile mobile = mobileList.get(position);
        holder.textName.setText(mobile.getMname());
        holder.textCompany.setText(mobile.getCompany());
        holder.textPrice.setText(""+mobile.getPrice());
        Glide.with(context).load(API.Base_URL+"/"+mobile.getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mobileList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView textName,textCompany,textPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            textName = itemView.findViewById(R.id.textName);
            textCompany = itemView.findViewById(R.id.textCompany);
            textPrice = itemView.findViewById(R.id.textPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailsActivity.class);
                    intent.putExtra("mobile",mobileList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });

        }
    }
}
