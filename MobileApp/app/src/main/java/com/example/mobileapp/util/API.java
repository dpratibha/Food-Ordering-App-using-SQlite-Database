package com.example.mobileapp.util;

import com.example.mobileapp.entity.User;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface API {
     String Base_URL = "http://192.168.0.105:4000";

     @POST("/user/login")
     Call<JsonObject> loginUser(@Body User user);

     @POST("/user/register")
     Call<JsonObject> registerUser(@Body User user);

    @GET("/mobile/")
    Call<JsonObject> getAllMobiles();
    @GET("/orders/{id}")
   Call<JsonObject> getUserOrders(@Path("id")int id);

    @GET("/user/{id}")
    Call<JsonObject> getUserById(@Path("id")int id);


}
