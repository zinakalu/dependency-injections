package com.luv2code.Springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
System.out.println("In constructor: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Swim 10 laps as a warmup";
    }
    
}
