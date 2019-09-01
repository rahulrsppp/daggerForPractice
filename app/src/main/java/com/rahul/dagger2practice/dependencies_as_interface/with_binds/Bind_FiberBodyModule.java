package com.rahul.dagger2practice.dependencies_as_interface.with_binds;

import com.rahul.dagger2practice.dependencies_as_interface.Body;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class Bind_FiberBodyModule {

   @Binds
   abstract Body bindFiberBody(Bind_FiberBody fiberBody);

}
