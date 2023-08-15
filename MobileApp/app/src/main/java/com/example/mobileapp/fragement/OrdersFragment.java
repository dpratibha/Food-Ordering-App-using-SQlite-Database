package com.example.mobileapp.fragement;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mobileapp.R;
import com.example.mobileapp.adapter.MobileListAdapter;
import com.example.mobileapp.entity.Mobile;
import com.example.mobileapp.util.RetrofitClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrdersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrdersFragment extends Fragment {
RecyclerView recycleView;
List<Mobile> mobileList;
MobileListAdapter mobileListAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycleView= view.findViewById(R.id.recycleView);
        mobileList = new ArrayList<>();
        mobileListAdapter = new MobileListAdapter(getContext(),mobileList);
        recycleView.setAdapter(mobileListAdapter);
        recycleView.setLayoutManager(new GridLayoutManager(getContext(),1));
    }

    @Override
    public void onResume() {
        super.onResume();
        getUserOrders();
    }

    private void getUserOrders() {
        mobileList.clear();
        int id = getContext().getSharedPreferences("MobileApp", Context.MODE_PRIVATE).getInt("uid",0);
        RetrofitClient.getInstance().getApi().getUserOrders(id).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.body().getAsJsonObject().get("status").getAsString().equals("success")){
                    JsonArray jsonArray = response.body().getAsJsonObject().get("data").getAsJsonArray();
                    for (JsonElement element :jsonArray) {
                        Mobile mobile = new Mobile();
                        mobile.setId(element.getAsJsonObject().get("id").getAsInt());
                        mobile.setMname(element.getAsJsonObject().get("mname").getAsString());
                        mobile.setCompany(element.getAsJsonObject().get("Company").getAsString());
                        mobile.setRam(element.getAsJsonObject().get("ram").getAsInt());
                        mobile.setStorage(element.getAsJsonObject().get("storage").getAsInt());
                        mobile.setPrice(element.getAsJsonObject().get("price").getAsDouble());
                        mobile.setImage(element.getAsJsonObject().get("image").getAsString());
                        mobileList.add(mobile);
                    }
                    mobileListAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Toast.makeText(getContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}