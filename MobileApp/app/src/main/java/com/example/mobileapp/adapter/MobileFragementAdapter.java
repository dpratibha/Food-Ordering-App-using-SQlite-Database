package com.example.mobileapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mobileapp.fragement.MobileListFragment;
import com.example.mobileapp.fragement.OrdersFragment;
import com.example.mobileapp.fragement.ProfileFragment;

public class MobileFragementAdapter extends FragmentStateAdapter {
    public MobileFragementAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new MobileListFragment();
            case 1:
                return new OrdersFragment();
            case 2:
                return new ProfileFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
