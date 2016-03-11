package com.androidtechies.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.androidtechies.gates16.R;

/**
 * Created by Angad on 11/03/2016.
 */
public class RegistrationFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View V=inflater.inflate(R.layout.fragment_registration,container,false);
        WebView web=(WebView)V.findViewById(R.id.registerView);
        web.loadUrl("www.gatesgtbit.com");
        return V;
    }
}
