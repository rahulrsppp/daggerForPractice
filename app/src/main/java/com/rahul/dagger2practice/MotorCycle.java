package com.rahul.dagger2practice;

import android.util.Log;

import com.rahul.dagger2practice.outer_module_classes.Seat;

import javax.inject.Inject;
import javax.inject.Singleton;

@MyScope
public class MotorCycle {

    private static final String TAG = "Daggerwaa";

    @Inject
    public Seat seat;
    private Wheels wheels;

    private Driver driver;

    @Inject
    public MotorCycle( Wheels wheels, Driver driver) {
        this.wheels = wheels;
        this.driver = driver;
    }

    private MotorCycle(){}


    void onMotorCycleStart(){
        Log.e(TAG, "MotorCycle '"+this+"' is driving by '"+driver+"'");
    }


}
