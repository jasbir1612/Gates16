package com.androidtechies.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.androidtechies.gates16.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jasbir Singh on 3/9/2016.
 */
public class ListAdapter extends BaseAdapter
{   private Context mcontext;
    private ArrayList<EventItem> eventItems;

    public ListAdapter(Context context, ArrayList<EventItem> eventItems) {
        this.mcontext = context;
        this.eventItems = eventItems;
    }

    @Override
    public int getCount() {
        return eventItems.size();
    }

    @Override
    public EventItem getItem(int position) {
        return eventItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {   View row = convertView;
        if(row == null)
        {   LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_row, parent, false);
        }
        TextView event = (TextView) row.findViewById(R.id.events);
        TextView time = (TextView) row.findViewById(R.id.time);
        TextView desc = (TextView) row.findViewById(R.id.description);
        event.setText(eventItems.get(position).getTitle());
        Date date=new Date(eventItems.get(position).getTime());
        SimpleDateFormat ft=new SimpleDateFormat ("E dd/MM 'at' hh:mm a");
        time.setText(ft.format(date));
        desc.setText(eventItems.get(position).getDesc());
        return row;
    }
}
