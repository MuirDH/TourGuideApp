package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

/**
 * TourGuideApp Created by Muir on 20/05/2017.
 */

public class ImageLocation {
    Uri geo;

    public ImageLocation(String GPSLocation){
        geo = Uri.parse(GPSLocation);
    }

    // Create a Uri from an intent string. Use the result to create an Intent.
    // This Uri will open a map which shows the venue
    public void GoToMap(Fragment fragment){
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
        mapIntent.setPackage("com.google.android.apps.maps");
        fragment.startActivity(mapIntent);
    }
}
