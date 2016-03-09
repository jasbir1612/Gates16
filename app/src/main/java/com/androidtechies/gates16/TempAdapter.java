package com.androidtechies.gates16;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.androidtechies.gates16.Days.Day1;
import com.androidtechies.gates16.Days.Day2;
import com.androidtechies.gates16.Days.Day3;


public class TempAdapter extends FragmentPagerAdapter
{

    public TempAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;

        if(i==0)
        {
            fragment = new Day1();
        }
        else if(i==1)
        {
            fragment = new Day2();
        }
        else
        {
            fragment = new Day3();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        if(position ==0)
        {
            return "Day 1";
        }
        if(position ==1)
        {
            return "Day 2";
        }
        if(position ==2)
        {
            return "Day 3";
        }

        return  null;
    }

}