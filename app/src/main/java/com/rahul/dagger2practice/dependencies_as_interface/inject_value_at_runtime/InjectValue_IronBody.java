package com.rahul.dagger2practice.dependencies_as_interface.inject_value_at_runtime;

import android.util.Log;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import javax.inject.Inject;

public class InjectValue_IronBody implements Body {

    private static final String TAG = "Daggerwaa";
    private String bodyColor;


    public InjectValue_IronBody(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    @Override
    public void typeOfBody() {
        Log.e(TAG, "IV_IRON_BODY-Iron body added. And body color is: "+bodyColor );
    }
}
