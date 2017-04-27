package com.example.android.touristguide;

/**
 * Created by tzouanakos on 06/03/2017.
 */

public class Place {
    private String mAddress;
    private String mPlace;
    private int mImageResourceId;

    public Place(String place, String address, int imageResourceId) {
        mPlace = place;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Gets address
     *
     * @return
     */
    public String getmAddress() {
        return mAddress;
    }

    /**
     * Gets place
     *
     * @return
     */
    public String getmPlace() {
        return mPlace;
    }

    /**
     * Gets image resource id
     *
     * @return
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
