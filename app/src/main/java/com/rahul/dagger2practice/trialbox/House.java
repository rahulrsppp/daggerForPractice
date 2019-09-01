package com.rahul.dagger2practice.trialbox;

import android.util.Log;

import javax.inject.Inject;

public class House {
    private static final String TAG = "HOUSE";
    private ElectricWiring electricWiring;
    private Material material;

    @Inject
    House(ElectricWiring electricWiring, Material material){
        this.electricWiring =electricWiring;
        this.material=material;
    }

    public void houseConstructed(){
        Log.e(TAG, "House got constructed.");
    }
}
