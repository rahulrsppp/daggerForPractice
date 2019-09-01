package com.rahul.dagger2practice.trialbox;

import com.rahul.dagger2practice.MainActivity;

import dagger.Binds;
import dagger.Component;

@Component(modules = MaterialModule.class)
public interface HouseComponent {

     void instantiate(MainActivity mainActivity);
}
