package com.rahul.dagger2practice.dagger_interface;

import com.rahul.dagger2practice.Driver;
import com.rahul.dagger2practice.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();

}
