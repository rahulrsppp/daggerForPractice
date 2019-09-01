package com.rahul.dagger2practice;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Singleton
    @Provides
    Driver provideDriver(){
        return new Driver();
    }
}
