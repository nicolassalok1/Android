package com.example.nico.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstFregment.FirstFragInteractionListener {

    // use it to build a fragment transaction

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_container, new FirstFregment());
        fragmentTransaction.commit();

    }


    @Override
    public void ButtonClick1() {
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putString("message", "from2");
        FirstFregment firstFragment = new FirstFregment();
        firstFragment.setArguments(bundle);

        fragmentTransaction.replace(R.id.main_container, firstFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void ButtonClick2() {
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putString("message", "from1");
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(bundle);

        fragmentTransaction.replace(R.id.main_container, secondFragment)
                .addToBackStack(null)
                .commit();
    }


}
