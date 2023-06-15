package com.luv2code.Springcoredemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.Springcoredemo.common.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@RestController
public class DemoController {

    //define a private field for the dependency

    private Coach myCoach;
    // private Coach anotherCoach;


    //define a constructor for dependency injection- CONSTRUCTOR INJECTION

    // @Autowired //tells Spring to inject a dependency
    // public DemoController(@Qualifier("cricketCoach") Coach theCoach,  @Qualifier("cricketCoach") Coach theAnotherCoach){ //the default bean scope is singleton, no need of scope annotation
    //     myCoach = theCoach;
    //     anotherCoach = theAnotherCoach;   
    //     System.out.println("In constructor: " + getClass().getSimpleName());
    // }  //using @Qualifier to identify the bean that should be consumed i.e that should be on the browser



    


    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;   
    } 




    //SETTER INJECTION
    // @Autowired //spring uses this for dependency injection and the method name doesn't matter BC of the autowire annotation
    // public void setterCoach(Coach theCoach){
    //     myCoach = theCoach;
    // }




    @GetMapping("/dailyworkout")

    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    // @GetMapping("/check")
    // public String check(){return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);}
}
