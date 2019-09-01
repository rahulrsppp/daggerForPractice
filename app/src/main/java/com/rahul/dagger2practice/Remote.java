package com.rahul.dagger2practice;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Daggerwaa";

    @Inject
    public Remote() { }

    void setListener(){
        Log.e(TAG, "REMOTE- Remote Connected..");
    }

}
