package com.example.android.tourguideapp;

/**
 * {@link Place} represents a place that the user can look to.
 * It contains the name and info (usually the address) and sometimes image and/or price.
 */

public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mName;
    private String mInfo;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mPrice = null;

    //Constructors for every possible combination

    public Place(String name, String info) {
        mName = name;
        mInfo = info;
    }

    public Place(String name, String info, String price) {
        mName = name;
        mInfo = info;
        mPrice = price;
    }

    public Place(String name, String info, int imageResourceId) {
        mName = name;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    public Place(String name, String info, String price, int imageResourceId) {
        mName = name;
        mInfo = info;
        mPrice = price;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPrice() {
        return mPrice;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice() {
        return mPrice != null;
    }
}



