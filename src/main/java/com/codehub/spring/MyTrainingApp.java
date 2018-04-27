package com.codehub.spring;

public class MyTrainingApp {

    public static void main(String[] args) {

        //create a soccer object
        SoccerCoach coach = new SoccerCoach();

        //use the object
        System.out.println(coach.getDailyWorkout());
    }
}
