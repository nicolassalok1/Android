package com.example.nico.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nico on 05/12/2017.
 */

public class CustomViewpagerAdapter extends FragmentPagerAdapter {
    private static final int NB_PAGES = 2;

    public CustomViewpagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {         switch (position)
        {
            case 1:
                Bundle bundle = new Bundle();
                bundle.putString("message", "Goodbye wonderful world");
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                return secondFragment;
            default:
                return new FirstFregment();
        }
    }


    @Override
    public int getCount()
    {         return NB_PAGES;     }

}