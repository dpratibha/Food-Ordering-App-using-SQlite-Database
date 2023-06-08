package com.example.buttonpratice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editName,editCource;
    TextView textName,textCource;
    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName= findViewById(R.id.editName);
        editCource= findViewById(R.id.editCource);
        textName= findViewById(R.id.textName);
        textCource= findViewById(R.id.textCource);
        btnClickMe= findViewById(R.id.btnClickMe);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= editName.getText().toString();
                String cource= editCource.getText().toString();
                textName.setText(name);
                textCource.setText(cource);
            }
        });





    }
}