package com.androidtechies.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.androidtechies.gates16.R;
import com.androidtechies.model.EventItem;
import com.androidtechies.model.ListAdapter;

import java.util.ArrayList;

/**<p>
 * Created by Jasbir Singh on 2/16/2016.
 * </p>
 */
public class DayThirdFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{
    private Context context;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_day3, container, false);
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_day3);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        ArrayList<EventItem> event=new ArrayList<>();
        for(int i=0;i<10;i++)
        {   EventItem eventItem=new EventItem();
            eventItem.setTitle("Hackathon");
            eventItem.setTime(System.currentTimeMillis());
            eventItem.setDesc("Make any Software using your skills");
            event.add(eventItem);
        }
        ListView listView = (ListView) view.findViewById(R.id.list3);
        ListAdapter adapter = new ListAdapter(context,event);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onRefresh() {
        //Use this to reload on bottom scroll
        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {   Thread.sleep(5000);

                }
                catch (InterruptedException e)
                {   e.printStackTrace();
                }
                finally
                {
                    //Toast.makeText(context, "If you see this toast, You are yet to go.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        T1.start();
        mSwipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }
}
