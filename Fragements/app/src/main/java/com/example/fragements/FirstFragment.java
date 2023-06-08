package com.example.fragements;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {
    private  static final String tag="FirstFragement";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(tag,"OnCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(tag,"onCreatView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(tag,"onViewCreatated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(tag,"onViewStateRestored");
    }

    @Override
    public void onStart() {
        Log.e(tag,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(tag,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(tag,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(tag,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e(tag,"onDestroy");
        super.onDestroy();
    }
}