package com.endava.unittesting.model;

public enum  TimeSlot {
    ONE (1),
    TWO (2),
    THREE (3),
    FOUR (4);


    final int timeSlot;

    private TimeSlot(int timeSlot){
        this.timeSlot=timeSlot;
    }


}
