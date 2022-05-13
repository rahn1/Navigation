package com.example.navigationexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.navigationexample.databinding.FragmentNoBinding;

public class NoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentNoBinding binding = FragmentNoBinding.inflate(getLayoutInflater());

        binding.textViewNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_noFragment_to_landerFragment);
            }
        });

        return binding.getRoot();
    }
}