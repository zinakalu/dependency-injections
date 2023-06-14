package com.luv2code.Springcoredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DemoController {

    //define a private field for the dependency

    private Coach myCoach;


    //define a constructor for dependcy injection

    @Autowired //tells Spring to inject a dependency
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }




    @GetMapping("/dailyworkout")

    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
