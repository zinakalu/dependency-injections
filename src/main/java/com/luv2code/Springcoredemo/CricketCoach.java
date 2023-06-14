package com.luv2code.Springcoredemo;

import org.springframework.stereotype.Component;

@Component //marks the class as a Spring Bean, a spring bean is a regular Java class that's managed by Spring and the annotation also makes the bean available for dependency injection
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice for 20 minutes";
    }
    
}


//dependency injection is a form of Inversion of Control, where the control of creating and managing objects is shifted from the dependent class to an external entity i.e an injector or container. This contianer
//also inject object's dependencies

//a dependdency refers to a relationship between two classes where one class depends on the functionality proivded by another class.