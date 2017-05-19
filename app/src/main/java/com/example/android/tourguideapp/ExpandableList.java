package com.example.android.tourguideapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class ExpandableList {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> entrance = new ArrayList<String>();
        entrance.add(String.valueOf(R.drawable.trinity));
        entrance.add("Placeholder text");


        List<String> kitchen = new ArrayList<String>();
        kitchen.add(String.valueOf(R.drawable.trinitykitchen));
        kitchen.add("Placeholder text");


        List<String> events = new ArrayList<String>();
        events.add(String.valueOf(R.drawable.trinityeventsbutton));
        events.add("Placeholder text");

        List<String> art = new ArrayList<String>();
        events.add(String.valueOf(R.drawable.trinityart));
        events.add("Placeholder text");

        List<String> entertainment = new ArrayList<String>();
        events.add(String.valueOf(R.drawable.trinityentertainment));
        events.add("Placeholder text");


        expandableListDetail.put("ENTRANCE", entrance);
        expandableListDetail.put("KITCHEN", kitchen);
        expandableListDetail.put("EVENTS", events);
        expandableListDetail.put("ART", art);
        expandableListDetail.put("ENTERTAINMENT", entertainment);
        return expandableListDetail;
    }

}
