package com.androidtechies.gates16.Days;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.androidtechies.gates16.R;
import com.androidtechies.gates16.TempAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    ViewPager pager;

    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.events_fragment, container, false);

        pager = (ViewPager) view.findViewById(R.id.pager);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        pager.setAdapter(new TempAdapter(fragmentManager));

        PagerTabStrip pagerTabStrip = (PagerTabStrip) view.findViewById(R.id.strip_title);
        pagerTabStrip.setDrawFullUnderline(true);
        pagerTabStrip.setTabIndicatorColor(Color.BLACK);

        return view;
    }

}
