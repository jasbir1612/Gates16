package com.androidtechies.gates16;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androidtechies.gates16.Days.Day1;
import com.androidtechies.gates16.Days.Day2;
import com.androidtechies.gates16.Days.Day3;

public class MainActivity extends AppCompatActivity {

    ViewPager pager = null;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        pager.setAdapter(new tempAdapter(fragmentManager));

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
    }
}
class tempAdapter extends FragmentPagerAdapter
{

    public tempAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        if(i==0)
        {
            fragment = new Day1();
        }
        if(i==1)
        {
            fragment = new Day2();
        }
        if(i==2)
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
