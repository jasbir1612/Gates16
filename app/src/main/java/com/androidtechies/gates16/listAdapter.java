package com.androidtechies.gates16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jasbir Singh on 3/9/2016.
 */
public class listAdapter extends ArrayAdapter<String> {

    Context mcontext;
    String[] events, time, desc;
    int[] img;

    public listAdapter(Context context,String[] events, String[] time, String[] desc) {
        super(context, R.layout.list_row,R.id.events,events);
        this.mcontext = context;
        this.events = events;
        this.time = time;
        this.desc = desc;
    }

    class MyViewHolder{

        TextView event;
        TextView time,desc;
//        ImageView listImage;

        MyViewHolder(View v){
            event = (TextView) v.findViewById(R.id.events);
            time = (TextView) v.findViewById(R.id.time);
            desc = (TextView) v.findViewById(R.id.description);
//            listImage = (ImageView) v.findViewById(R.id.list_image);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        MyViewHolder holder = null;

        if(row == null) {
            LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_row, parent, false);
            holder = new MyViewHolder(row);
            row.setTag(holder);
        }
        else {
            holder = (MyViewHolder) row.getTag();
        }

//        namesText = (TextView) row.findViewById(R.id.textView_name);
//        TextView ratesText =
//        addressText = (TextView) row.findViewById(R.id.textView_address);
//        TextView contactText = (TextView) row.findViewById(R.id.textView_contact);
//        listImage = (ImageView) row.findViewById(R.id.list_image);

        holder.event.setText(events[position]);
        holder.time.setText(time[position]);
        holder.desc.setText(desc[position]);
//        contactText.setText(contact[position]);

        return row;
    }
}
