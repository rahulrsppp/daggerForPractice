package com.rahul.dagger2practice;

import android.app.Application;

import com.rahul.dagger2practice.dagger_interface.ActivityComponent;
import com.rahul.dagger2practice.dagger_interface.AppComponent;
import com.rahul.dagger2practice.dagger_interface.DaggerAppComponent;

public class MyApplication extends Application {

    public AppComponent getAppComponent() {
        return appComponent;
    }

    private  AppComponent appComponent;


    private ActivityComponent activityComponent;




    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();

    }
}
