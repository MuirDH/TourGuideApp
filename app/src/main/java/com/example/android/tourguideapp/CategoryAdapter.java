package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {


    /** Context of the app */
    private Context mContext;


    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LeedsCentreFragment();
        } else if (position == 1){
            return new TrinityFragment();
        } else if (position == 2){
            return new BelgraveFragment();
        } else if (position == 3){
            return new MarketFragment();
        } else {
            return new ArchesFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_leeds);
        } else if (position == 1) {
            return mContext.getString(R.string.category_trinity);
        } else if (position == 2) {
            return mContext.getString(R.string.category_belgrave);
        } else if (position == 3){
            return mContext.getString(R.string.category_market);
        } else {
            return mContext.getString(R.string.category_arches);
        }
    }


}