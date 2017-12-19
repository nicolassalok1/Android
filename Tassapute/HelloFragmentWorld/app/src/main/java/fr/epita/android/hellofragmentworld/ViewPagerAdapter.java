package fr.epita.android.hellofragmentworld;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tassadit on 29/11/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static final int NB_PAGES = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return new MainActivityFragment();
            case 1 :
                return new SecondFragment();
            case 2 :
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NB_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
