package com.example.nico.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.Toast;

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
    {
        Fragment fragment;
        switch (position)
        {

            case 1  :
                fragment = new SecondFragment();
                break;
//PROBLEME JE NE COMPREND PAS COMMENT REVENIR SUR LE PREMIER FRAGMENT
            default:
                fragment = new FirstFregment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount()
    {
        return NB_PAGES;
    }
}



/*
             case 2:
                //Bundle bundle2 = new Bundle();
                //bundle2.putString("ButtonLabel", "Message from Second Activity");
                SecondFragment secondFragment = new SecondFragment();
                //secondFragment.setArguments(bundle2);
                return secondFragment;
*/