package com.example.nico.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Set content view setContentView(R.layout.activity_main);
// Retrieve fragment manager
        FragmentManager fragmentManager = getFragmentManager();
// Use fragment manager to display the first fragment
        MainFragment fragment = new MainFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_container, fragment, "main_fragment");
        fragmentTransaction.commit();
    }
}
