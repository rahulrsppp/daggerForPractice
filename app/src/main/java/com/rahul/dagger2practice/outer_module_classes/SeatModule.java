package com.rahul.dagger2practice.outer_module_classes;

import dagger.Module;
import dagger.Provides;

@Module
public class SeatModule {

    @Provides
    SeatCover provideSeatCover(){
        SeatCover seatCover= new SeatCover();
        seatCover.comfortLevel();
        return seatCover;
    }

    @Provides
    SeatBelt provideSeatBelt(){
        return new SeatBelt();
    }

    @Provides
    Seat provideSeat(SeatCover seatCover, SeatBelt seatBelt){
        seatBelt.beltLength();
        return new Seat(seatBelt, seatCover);
    }
}
