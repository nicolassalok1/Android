package com.example.nico.apping_exam_memory_nicolaspelletier;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements FirstFragInteractionListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // 1 : On Recupere le composant XML qui va gerer l'enchainement des vues
        ViewPager viewPager = findViewById(R.id.main_viewpager);
        // 2 : Création de l'Adapter
        CustomViewpagerAdapter viewpagerAdapter = new CustomViewpagerAdapter(fragmentManager);
        // 3 : liaison de l'adapter au composant XML
        viewPager.setAdapter(viewpagerAdapter);

        fragmentTransaction.replace(R.id.main_viewpager, new HelloFragment());
        fragmentTransaction.commit();

    }

    @Override
    public void ButtonClickG() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Memory_Game"));//valeur est l'url à accéder
        startActivity(intent);
    }

    @Override
    public void ButtonClickStart() {
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_viewpager, new ScoresFragment());
        fragmentTransaction.commit();
    }


}
