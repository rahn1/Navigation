package com.example.navigationexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationexample.databinding.FragmentLanderBinding;

public class LanderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentLanderBinding binding = FragmentLanderBinding.inflate(getLayoutInflater());

        binding.buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_landerFragment_to_yesFragment);
            }
        });

        binding.buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_landerFragment_to_noFragment);
            }
        });

        return binding.getRoot();
    }
}