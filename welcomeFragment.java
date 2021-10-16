package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class welcomeFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tv1 = view.findViewById(R.id.tv1);
        TextView tv2 = view.findViewById(R.id.tv2);
        String username =welcomeFragmentArgs.fromBundle(getArguments()).getUsername();
         String password =welcomeFragmentArgs.fromBundle(getArguments()).getPassword();
         tv1.setText(username);
         tv2.setText(password);
    }
}