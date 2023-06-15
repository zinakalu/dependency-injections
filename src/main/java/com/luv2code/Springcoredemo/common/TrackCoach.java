package com.luv2code.Springcoredemo.common;

// import org.springframework.context.annotation.Lazy;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary // --> since there are multiple implementations, we're making TrackCoach the PRIMARY Coach
// @Lazy //--> defers the initialization of beans until they're actually needed
public class TrackCoach implements Coach {


    public TrackCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }
    
}
