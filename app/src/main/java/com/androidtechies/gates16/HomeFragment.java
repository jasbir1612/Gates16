package com.androidtechies.gates16;


import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Toolbar toolbar;
    Context c;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

//        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout)view.findViewById(R.id.collapse_toolbar);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            collapsingToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary, getActivity().getTheme()));
//        }
//        else {
//            collapsingToolbar.setBackgroundColor(getResources().getColor(android.R.color.transparent));
//        }
//        collapsingToolbar.setCollapsedTitleTextColor(Color.parseColor("#FFFFFF"));
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.c = context;

    }
}
