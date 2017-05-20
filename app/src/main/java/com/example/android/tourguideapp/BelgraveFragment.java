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

public class BelgraveFragment extends Fragment {

    private ImageLocation location = new ImageLocation("geo:53.800803,-1.5432022");

    public BelgraveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_group, container, false);

        //Create an ArrayList containing the image and text for the Belgrave Music Hall visit items
        final ArrayList<VisitList> visitLists = new ArrayList<>();

        visitLists.add(new VisitList(R.drawable.belgraveentrance, R.string.belgrave_entrance));
        visitLists.add(new VisitList(R.drawable.belgravecanteen, R.string.belgrave_canteen));
        visitLists.add(new VisitList(R.drawable.belgravefood, R.string.belgrave_food));
        visitLists.add(new VisitList(R.drawable.belgraveroof, R.string.belgrave_roof_garden));
        visitLists.add(new VisitList(R.drawable.belgraveevents, R.string.belgrave_events));

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

                location.GoToMap(BelgraveFragment.this);

            }

        });

        return rootView;
    }

}
