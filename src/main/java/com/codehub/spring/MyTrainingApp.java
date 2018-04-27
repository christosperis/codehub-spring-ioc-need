package com.codehub.spring;

import com.codehub.spring.impl.BasketballCoach;

public class MyTrainingApp {

    public static void main(String[] args) {

        //create a soccer object
        Coach coach = new BasketballCoach();

        //use the object
        System.out.println(coach.getDailyWorkout());
    }
}
