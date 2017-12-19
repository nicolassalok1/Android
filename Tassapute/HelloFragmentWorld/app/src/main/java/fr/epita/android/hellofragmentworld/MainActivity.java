package fr.epita.android.hellofragmentworld;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainActivityFragment.MainActivityFragmentCallback {

    private FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a ViewPager
        ViewPager vpPager = (ViewPager) findViewById(R.id.main_viewpager);
        adapterViewPager = new ViewPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

        // Add fragment
        /*final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, new MainActivityFragment()); // On peut mettre add à la place de replace
        fragmentTransaction.commit();*/
    }

    @Override
    public void onButtonClicked() {
        SecondFragment secondFragment = new SecondFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, secondFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
