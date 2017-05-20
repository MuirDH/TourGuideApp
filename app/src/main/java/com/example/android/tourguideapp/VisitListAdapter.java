package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class VisitListAdapter extends ArrayAdapter<VisitList> {

    private int ColorResourceId;

    public VisitListAdapter(Context context, ArrayList<VisitList> visitLists, int colorResourceId) {

        super(context, 0, visitLists);
        ColorResourceId = colorResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        /**
         * get the {@link VisitListAdapter} object located at this position in the list
         */

        VisitList currentList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version name
        TextView visitListTextView = (TextView) listItemView.findViewById(R.id.visitListTextView);

        // Get the text from the current VisitList object and set this on the VisitList TextView
        visitListTextView.setText(currentList.getDescriptiveText());

        // Find the ImageView in the list_item.xml layout with the ID visitListImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.visitListImageView);

        // Set the ImageView to the image resource specified in the current VisitList
        imageView.setImageResource(currentList.getImageResourceId());

        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        View itemContainer = listItemView.findViewById(R.id.item_container);

        int color = ContextCompat.getColor(getContext(), ColorResourceId);

        itemContainer.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown
        return listItemView;

    }
}
