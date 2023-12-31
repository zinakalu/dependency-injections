package com.luv2code.Springcoredemo.common;

import org.springframework.stereotype.Component;
// import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.context.annotation.Scope;

// import jakarta.annotation.PostConstruct;
// import jakarta.annotation.PreDestroy;

@Component //marks the class as a Spring Bean, a spring bean is a regular Java class that's managed by Spring and the annotation also makes the bean available for dependency injection
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // -> new object instance is created for each injection //PROTOTYPE SCOPE
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constrcutor: " + getClass().getSimpleName());
    }


    //define our init method
    // @PostConstruct
    // public void doMyStartupStuff(){
    //     System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    // }

    //define our destroy method
    // @PreDestroy
    // public void doMyCleanupStuff(){
    //     System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    // }


    @Override
    public String getDailyWorkout(){
        return "Practice for 20 minutes!!!";
    }
    
}


//dependency injection is a form of Inversion of Control, where the control of creating and managing objects is shifted from the dependent class to an external entity i.e an injector or container. This contianer
//also inject object's dependencies

//a dependdency refers to a relationship between two classes where one class depends on the functionality proivded by another class.