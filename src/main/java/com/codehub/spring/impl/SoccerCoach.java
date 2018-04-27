package com.codehub.spring.impl;

import com.codehub.spring.Coach;

public class SoccerCoach implements Coach {

    public static final String PERFORM_A_SOCCER_TRAINING = "Perform a soccer training";

    @Override
    public String getDailyWorkout() {
        return PERFORM_A_SOCCER_TRAINING;
    }

}
