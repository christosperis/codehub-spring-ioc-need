package com.codehub.spring;

import com.codehub.spring.impl.SoccerCoach;

public class MyTrainingApp {

    public static void main(String[] args) {

        //create a soccer object
        Coach coach = new SoccerCoach();

        //use the object
        System.out.println(coach.getDailyWorkout());
    }
}
