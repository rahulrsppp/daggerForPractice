package com.rahul.dagger2practice.outer_module_classes;

public class Seat {

    private SeatBelt seatBelt;
    private SeatCover seatCover;

    Seat(SeatBelt seatBelt, SeatCover seatCover){
        this.seatBelt = seatBelt;
        this.seatCover = seatCover;

    }


}
