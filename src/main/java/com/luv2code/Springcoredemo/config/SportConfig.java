package com.luv2code.Springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.Springcoredemo.common.Coach;
import com.luv2code.Springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

 @Bean //("aquatic") //giving the bean id a custom id and using it in place of swimCoach in @Qualifier 
public Coach swimCoach(){ //the bean id defaults to the method name
    return new SwimCoach(); //this line returns an instance of swimCoach
}
    
}
