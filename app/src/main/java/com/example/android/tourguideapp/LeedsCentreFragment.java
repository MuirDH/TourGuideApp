package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class LeedsCentreFragment extends Fragment {

    public LeedsCentreFragment(){
        //required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_leeds, container, false);

        return rootView;
    }
}
