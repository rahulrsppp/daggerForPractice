package com.rahul.dagger2practice.dependencies_as_interface.inject_value_at_runtime;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class InjectValue_FiberBodyModule {

   @Binds
   abstract Body provideFiberBody(InjectValue_FiberBody injectValue_fiberBody);

}
