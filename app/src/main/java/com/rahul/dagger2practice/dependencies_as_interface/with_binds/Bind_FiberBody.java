package com.rahul.dagger2practice.dependencies_as_interface.with_binds;

import android.util.Log;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import javax.inject.Inject;

public class Bind_FiberBody implements Body {

    private static final String TAG = "Daggerwaa";

    @Inject
    public Bind_FiberBody() {
    }

    @Override
    public void typeOfBody() {
        Log.e(TAG, "Fiber body added" );
    }
}
