package com.rahul.dagger2practice;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "Daggerwaa";

    @Inject
    public Engine() { }

    @Inject
    void onEngineAttached(){
        Log.e(TAG, "ENGINE- Engine started..");
    }


}
