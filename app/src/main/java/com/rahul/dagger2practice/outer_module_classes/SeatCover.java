package com.rahul.dagger2practice.outer_module_classes;

import android.util.Log;

import javax.inject.Inject;

public class SeatCover {
    private static final String TAG = "Daggerwaa";

    void comfortLevel(){
        Log.e(TAG, "SEAT_COVER- ComfortLevel: HIGH");
    }
}
