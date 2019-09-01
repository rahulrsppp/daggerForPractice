package com.rahul.dagger2practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rahul.dagger2practice.dagger_interface.ActivityComponent;
import com.rahul.dagger2practice.dagger_interface.DaggerActivityComponent;
import com.rahul.dagger2practice.trialbox.DaggerHouseComponent;
import com.rahul.dagger2practice.trialbox.House;
import com.rahul.dagger2practice.trialbox.HouseComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Daggerwaa";

    //@Inject public Car car;
    //@Inject public MotorCycle motorCycle1,motorCycle2;
    @Inject public House house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // injecting values to the first module and then builder

          /*ActivityComponent carData=  DaggerCarComponent.builder()
                  .injectValue_IronBodyModule(new InjectValue_IronBodyModule("RED"))
                  .build();*/

          // injecting values directly to the builder
          /*ActivityComponent carData = DaggerCarComponent.builder()
                  .bodyColor("Sky Blue")
                  .bodyShape("Blood Red")
                  .build();*/

          // injecting values directly to the builder and App Component which will provide dependency
       /* ActivityComponent carData = DaggerActivityComponent.builder()
                .bodyColor("Sky Blue")
                .bodyShape("Blood Red")
              //  .appComponent(((MyApplication)getApplication()).getAppComponent())
                .build();
        carData.inject(this);

        //car.onCarStart();
        motorCycle1.onMotorCycleStart();
        motorCycle2.onMotorCycleStart();
*/

   HouseComponent houseComponent= DaggerHouseComponent.builder().build();
        houseComponent.instantiate(this);

        house.houseConstructed();

    }
}
