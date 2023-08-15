package com.example.mobileapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mobileapp.R;
import com.example.mobileapp.entity.User;
import com.example.mobileapp.util.RetrofitClient;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    EditText editName,editEmail,editPassword,editConformPassword,editMobile;
    Button btnRegister,btnCancle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        editConformPassword = findViewById(R.id.editConformPassword);
        editMobile = findViewById(R.id.editMobile);
        btnRegister = findViewById(R.id.btnRegister);
        btnCancle = findViewById(R.id.btnCancle);
        btnRegisterClickEvent();
    }

    private void btnRegisterClickEvent() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user= validateUser();
                if(user !=null ){
                    RetrofitClient.getInstance().getApi().registerUser(user).enqueue(new Callback<JsonObject>() {
                        @Override
                        public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                            if(response.body().getAsJsonObject().get("status").getAsString().equals("sucess")){
                                Toast.makeText(RegisterActivity.this, "User Register Sucesfully", Toast.LENGTH_SHORT).show();
                                finish();
                            }

                        }

                        @Override
                        public void onFailure(Call<JsonObject> call, Throwable t) {
                            Toast.makeText(RegisterActivity.this, "Something went Wrong", Toast.LENGTH_SHORT).show();

                        }
                    });
                }
            }
        });
    }

    private User validateUser() {
        String passwprd= editPassword.getText().toString();
        String conformpass= editConformPassword.getText().toString();
        if(passwprd.equals(conformpass))
        {
            User user= new User();
            user.setUname(editName.getText().toString());
            user.setPassword(editPassword.getText().toString());
            user.setEmail(editEmail.getText().toString());
            user.setMobile(editMobile.getText().toString());
            return user;

    } else {
            Toast.makeText(this, "passwords do not match", Toast.LENGTH_SHORT).show();
            return null;
        }
    }

    public void cancel(View view){

    }
}