package com.androidtechies.gates16.home_pager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidtechies.gates16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PagerFragment2 extends Fragment {


    public PagerFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pager_fragment2, container, false);
    }

}
