package com.rahul.dagger2practice.dependencies_as_interface.with_binds;

import android.util.Log;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import javax.inject.Inject;

public class Bind_IronBody implements Body {

    private static final String TAG = "Daggerwaa";

    @Inject
    public Bind_IronBody() {
    }

    @Override
    public void typeOfBody() {
        Log.e(TAG, "Iron body added" );
    }
}
