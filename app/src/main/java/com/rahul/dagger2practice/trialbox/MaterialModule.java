package com.rahul.dagger2practice.trialbox;

import dagger.Module;
import dagger.Provides;

@Module
public class MaterialModule {

    @Provides
    Material provideMaterial(){
        Material material=new Material();
        material.materialAdded();
        return material;
    }

}
