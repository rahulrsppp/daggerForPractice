package com.rahul.dagger2practice.dependencies_as_interface.inject_value_at_runtime;

import android.util.Log;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import javax.inject.Inject;
import javax.inject.Named;

public class InjectValue_FiberBody implements Body {

    private static final String TAG = "Daggerwaa";
    private String bodyColor;
    private String bodyShape;

    @Inject
    public InjectValue_FiberBody(@Named("body color") String bodyColor, @Named("body shape") String bodyShape) {
        this.bodyColor = bodyColor;
        this.bodyShape = bodyShape;
    }

    @Override
    public void typeOfBody() {
        Log.e(TAG, "IV_FIBER_BODY- Fiber body added. And body color is: "+bodyColor+"\n and Body Shape is: "+bodyShape);
    }
}
