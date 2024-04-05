package com.example.socialnetwork.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.socialnetwork.R;


public class LoginFragment extends Fragment {
    public LoginFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        EditText usernameEditText = view.findViewById(R.id.userName);
        EditText passwordEditText = view.findViewById(R.id.password);
        Button loginButton = view.findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // In thông tin ra console
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });

        return view;
    }
}