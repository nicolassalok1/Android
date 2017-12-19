package com.example.nico.apping_exam_memory_nicolaspelletier;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nico.apping_exam_memory_nicolaspelletier.HelloFragment;

/**
 * Created by nico on 05/12/2017.
 */

class CustomViewpagerAdapter extends FragmentPagerAdapter {

    public CustomViewpagerAdapter(FragmentManager fm)
    {
        super(fm);
    }
    private static final int NB_PAGES = 2;

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 :
                return new HelloFragment();
            case 1 :
                return new ScoresFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {         return NB_PAGES;     }

}