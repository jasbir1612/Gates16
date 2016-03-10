package com.androidtechies.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toolbar;

import com.androidtechies.gates16.R;
import com.androidtechies.model.GridViewAdapter;
import com.androidtechies.model.ImageItem;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    Toolbar toolbar;
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);
//        CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout)view.findViewById(R.id.collapse_toolbar);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            collapsingToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary, getActivity().getTheme()));
//        }
//        else {
//            collapsingToolbar.setBackgroundColor(getResources().getColor(android.R.color.transparent));
//        }
//        collapsingToolbar.setCollapsedTitleTextColor(Color.parseColor("#FFFFFF"));


        //TODO: Figure Out How to reuse Sponser Adapter and Items Here

        GridView gridView=(GridView)view.findViewById(R.id.gridView2);
        ArrayList<ImageItem> arr=new ArrayList<>();
        for(int i=0;i<4;i++)
        {   arr.add(new ImageItem(R.mipmap.ic_launcher,i+"th Grid"));
        }
        gridView.setAdapter(new GridViewAdapter(context,arr));

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
