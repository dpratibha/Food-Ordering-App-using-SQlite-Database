package com.example.studentcurd;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Istudent {
    @GET("")
    Call<JSONObject> getStudent();

    @GET("{rollno}")
    Call<JSONObject> getStudentByRoll(@Path("rollno") int rollno);

    @DELETE("{rollno}")
    Call<JSONObject> deleteStudentById(@Path("rollno") int rollno);

    @POST("add")
    Call<JSONObject> addStudent(@Body Student student);
}
