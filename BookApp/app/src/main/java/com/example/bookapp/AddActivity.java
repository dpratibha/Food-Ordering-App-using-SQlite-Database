package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    EditText editName,editAuthor,editType,editPrice;
    Button btnAddBook,btnCancle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editName = findViewById(R.id.editName);
        editAuthor = findViewById(R.id.editAuthor);
        editType = findViewById(R.id.editType);
        editPrice = findViewById(R.id.editPrice);
        btnAddBook = findViewById(R.id.btnAddBook);
        btnCancle = findViewById(R.id.btnCancle);
        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editName.getText().toString();
                String author=editAuthor.getText().toString();
                String type= editType.getText().toString();
                int price= Integer.parseInt(editPrice.getText().toString());
                 BookDBHelper bookDBHelper= new BookDBHelper(AddActivity.this);
                 bookDBHelper.insertBook(name,author,type,price);
                Toast.makeText(AddActivity.this, "Book Added", Toast.LENGTH_SHORT).show();



            }
        });



    }
}