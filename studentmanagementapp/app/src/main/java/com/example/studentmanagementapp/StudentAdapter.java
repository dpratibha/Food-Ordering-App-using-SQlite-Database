package com.example.studentmanagementapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyVivewHolder > {
    Context context;

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    List<Student> studentList;

    @NonNull
    @Override
    public MyVivewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.showbooklist,null);
        return new MyVivewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVivewHolder holder, int position) {
        holder.textName.setText(this.studentList.get(position).getName());
        holder.textMobile.setText(this.studentList.get(position).getMobile());
        holder.textSchool.setText(this.studentList.get(position).getSchool());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyVivewHolder extends RecyclerView.ViewHolder {
        TextView textName,textMobile,textSchool;
        public MyVivewHolder(@NonNull View itemView) {
            super(itemView);
            textName= itemView.findViewById(R.id.textName);
            textMobile= itemView.findViewById(R.id.textMobile);
            textSchool= itemView.findViewById(R.id.textSchool);


        }
    }
}
