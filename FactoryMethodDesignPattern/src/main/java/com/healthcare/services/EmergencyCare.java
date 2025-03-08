package com.healthcare.services;

public class EmergencyCare implements HealthcareService{

    @Override
    public void provideService() {
        System.out.println("Providing Emergency care service");
    }
}
