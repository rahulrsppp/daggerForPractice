package com.rahul.dagger2practice.dagger_interface;

import com.rahul.dagger2practice.DriverModule;
import com.rahul.dagger2practice.MainActivity;
import com.rahul.dagger2practice.MyScope;
import com.rahul.dagger2practice.dependencies_as_interface.inject_value_at_runtime.InjectValue_FiberBodyModule;
import com.rahul.dagger2practice.outer_module_classes.SeatModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@MyScope
@Component(dependencies = AppComponent.class, modules = {SeatModule.class, InjectValue_FiberBodyModule.class})
public interface ActivityComponent {

//    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder bodyColor(@Named("body color") String bodyColor);

        @BindsInstance
        Builder bodyShape(@Named("body shape") String bodyShape);

        Builder appComponent(AppComponent appComponent);


        ActivityComponent build();


    }


}
