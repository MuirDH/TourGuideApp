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

public class MarketFragment extends Fragment {

    private ImageLocation location = new ImageLocation("geo:53.7986266,-1.5414524");

    public MarketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_group, container, false);

        //Create an ArrayList containing the image and text for the Market visit items
        final ArrayList<VisitList> visitLists = new ArrayList<>();

        visitLists.add(new VisitList(R.drawable.marketentrance, R.string.market_entrance));
        visitLists.add(new VisitList(R.drawable.marketeducation, R.string.market_education));
        visitLists.add(new VisitList(R.drawable.marketfoodcourt, R.string.market_food_hall));
        visitLists.add(new VisitList(R.drawable.marketvariety, R.string.market_variety));
        visitLists.add(new VisitList(R.drawable.markethistory, R.string.market_history));

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

                location.GoToMap(MarketFragment.this);
            }

        });

        return rootView;
    }
}
