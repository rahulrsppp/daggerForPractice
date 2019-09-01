package com.rahul.dagger2practice;

import android.util.Log;

import com.rahul.dagger2practice.dependencies_as_interface.Body;
import com.rahul.dagger2practice.outer_module_classes.Seat;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Daggerwaa";

    private Wheels wheels;
    @Inject Engine engine;

    // case if, dependencies are from outside source
    @Inject Seat seat;

    // case if, dependencies are injected as Interface
    @Inject Body body;

    @Inject
    public Car( Wheels wheels) {
        this.wheels = wheels;
     }

    @Inject
    public void enableRemote(Remote remote){
        body.typeOfBody();
        remote.setListener();
    }

    void onCarStart(){
        Log.e(TAG, "Car is driving.. ");
    }
}
