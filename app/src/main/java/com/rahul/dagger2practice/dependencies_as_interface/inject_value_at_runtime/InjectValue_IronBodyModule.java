package com.rahul.dagger2practice.dependencies_as_interface.inject_value_at_runtime;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class InjectValue_IronBodyModule {
   private static final String TAG = "Daggerwaa";

   private String bodyColor;

   public InjectValue_IronBodyModule(String bodyColor) {
      this.bodyColor = bodyColor;
   }
   @Provides
   Body provideIronBody(){
      return new InjectValue_IronBody(bodyColor);
   }

}
