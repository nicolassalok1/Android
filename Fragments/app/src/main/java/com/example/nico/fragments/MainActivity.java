package com.example.nico.fragments;

import android.content.Intent;
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


public class MainActivity extends AppCompatActivity implements FirstFragInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        // 1 : On Recupere le composant XML qui va gerer l'enchainement des vues
        ViewPager viewPager = findViewById(R.id.main_viewpager);
        // 2 : Création de l'Adapter
        CustomViewpagerAdapter viewpagerAdapter = new CustomViewpagerAdapter(fragmentManager);
        // 3 : liaison de l'adapter au composant XML
        viewPager.setAdapter(viewpagerAdapter);
    }

    @Override
    public void ButtonClick1() {

        ViewPager viewPager = findViewById(R.id.main_viewpager);
        viewPager.setCurrentItem(1);
    }

    @Override
    public void ButtonClick2() {

        ViewPager viewPager = findViewById(R.id.main_viewpager);
        viewPager.setCurrentItem(2);
    }

}
