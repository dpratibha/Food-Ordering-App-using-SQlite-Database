package com.example.studentmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addActivity extends AppCompatActivity {
    EditText editName,editMobile,editSchool;
    Button btnAddStudent,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editName= findViewById(R.id.editName);
        editMobile= findViewById(R.id.editMobile);
        editSchool= findViewById(R.id.editSchool);
        btnAddStudent= findViewById(R.id.btnAddStudent);
        btnCancel= findViewById(R.id.btnCancel);
        btnAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editName.getText().toString();
                String mobile=editMobile.getText().toString();
                String school= editSchool.getText().toString();
                StudentDBHelper dbHelper= new StudentDBHelper(addActivity.this);
                dbHelper.insert(name,mobile,school);
                Toast.makeText(addActivity.this, "Data Added", Toast.LENGTH_SHORT).show();


            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}