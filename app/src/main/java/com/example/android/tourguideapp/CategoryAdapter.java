package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;


    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public int getCount() {
        return 4;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment #0 - this will show TrinityFragment
                return new TrinityFragment();
            case 1: // Fragment #1 - this will show BelgraveFragment
                return new BelgraveFragment();
            case 2: // Fragment #2 - This will show MarketFragment
                return new MarketFragment();
            case 3: // Fragment #3 - this will show ArchesFragment
                return new ArchesFragment();
            default:
                return null;
        }
    }

    // sets the words which appear on the navigation tabs
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_trinity);
            case 1:
                return mContext.getString(R.string.category_belgrave);
            case 2:
                return mContext.getString(R.string.category_market);
            case 3:
                return mContext.getString(R.string.category_arches);
            default:
                return null;
        }
        /*if (position == 0) {
            return mContext.getString(R.string.category_trinity);
        } else if (position == 1) {
            return mContext.getString(R.string.category_belgrave);
        } else if (position == 2) {
            return mContext.getString(R.string.category_market);
        } else {
            return mContext.getString(R.string.category_arches);*/
    }
}


