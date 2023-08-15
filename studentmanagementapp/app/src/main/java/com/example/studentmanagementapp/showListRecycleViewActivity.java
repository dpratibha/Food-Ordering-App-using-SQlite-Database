package com.example.studentmanagementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class showListRecycleViewActivity extends AppCompatActivity {
   RecyclerView recyclerView;
   List<Student> studentList;
   StudentAdapter studentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_recycle_view);
        recyclerView = findViewById(R.id.recyclerView);
        studentList= new ArrayList<>();
        studentAdapter= new StudentAdapter(this,studentList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
}