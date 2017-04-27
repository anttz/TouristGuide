package com.example.android.touristguide;

/**
 * Created by tzouanakos on 06/03/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlacesPageAdapter extends FragmentPagerAdapter {

    Context mContext;

    public PlacesPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new BarsFragment();
            default:
                return null;
        }

    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return mContext.getString(R.string.attractions_title);
            case 1:
                return mContext.getString(R.string.restaurants_title);
            case 2:
                return mContext.getString(R.string.Hotels_title);
            case 3:
                return mContext.getString(R.string.Bars_title);
            default:
                return null;
        }
    }
}
