package com.example.socialnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.socialnetwork.fragments.LoginFragment;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new LoginFragment())
                .commit();
    }
}