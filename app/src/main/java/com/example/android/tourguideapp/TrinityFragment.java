package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class TrinityFragment extends Fragment {

    private ImageLocation location = new ImageLocation("geo:53.7964367,-1.5461095");


    public TrinityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_group, container, false);

        //Create an ArrayList containing the image and text for the Trinity visit items
        final ArrayList<VisitList> visitLists = new ArrayList<>();

        visitLists.add(new VisitList(R.drawable.trinity, R.string.trinity_entrance));
        visitLists.add(new VisitList(R.drawable.trinityart, R.string.trinity_art));
        visitLists.add(new VisitList(R.drawable.trinityentertainment, R.string.trinity_entertainment));
        visitLists.add(new VisitList(R.drawable.trinityeventsbutton, R.string.trinity_events));
        visitLists.add(new VisitList(R.drawable.trinitykitchen, R.string.trinity_kitchen));

        // set the background colour for the fragment
        VisitListAdapter adapter = new VisitListAdapter(getActivity(), visitLists, R.color.category_background);

        // Find the Listview object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /*Make the Listview use the ArrayAdapter created above so that the ListView will display
         list items for each item in the list
         */
        listView.setAdapter(adapter);

        // Set an onClickListener which will open an intent to Google Maps
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                location.GoToMap(TrinityFragment.this);
            }

        });

        return rootView;
    }
}

