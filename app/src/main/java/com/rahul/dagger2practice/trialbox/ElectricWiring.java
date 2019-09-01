package com.rahul.dagger2practice.trialbox;

import android.util.Log;

import javax.inject.Inject;

public class ElectricWiring {
    private static final String TAG = "HOUSE";

    @Inject
    public ElectricWiring() {
    }

    public void  wireAdded(){
        Log.e(TAG, "Wire Inserted. " );
    }
}
