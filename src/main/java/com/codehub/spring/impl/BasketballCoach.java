package com.codehub.spring.impl;

import com.codehub.spring.Coach;

public class BasketballCoach implements Coach {

    private static final String PERFORM_A_BASKETBALL_TRAINING = "perform a basketball training";

    @Override
    public String getDailyWorkout() {
        return PERFORM_A_BASKETBALL_TRAINING;
    }
}
