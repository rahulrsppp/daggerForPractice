package com.rahul.dagger2practice;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = "Daggerwaa";

    @Inject
    public Wheels() { }

    @Inject
    void onWheelAttached(){
        Log.e(TAG, " WHEELS- Wheel Attached..");
    }

}
