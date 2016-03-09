package com.androidtechies.gates16.Days;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.androidtechies.gates16.R;
import com.androidtechies.gates16.listAdapter;

/**
 * Created by Jasbir Singh on 2/16/2016.
 */
public class Day2 extends Fragment{

    ListView listView;

    String [] events = {"Hackathon","Brain Storming","Laser Trap","Neck To Neck","Carnage","Bear And bulls"};
    String [] time = {"11:00 AM","12:00 Noon","11:00 AM","1:00 PM","10:00 AM","1:00 PM"};
    String [] desc = {"Make any Software using your skills","Its time to apply your mind to fullest","The Laser light game","Faceoff Debate","The Gaming Event","Apply your Business skills"};

    listAdapter adapter = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.day1, container, false);

        listView = (ListView) view.findViewById(R.id.list1);
        adapter = new listAdapter(getContext(), events, time, desc);
        listView.setAdapter(adapter);

        return  view;

    }
}
