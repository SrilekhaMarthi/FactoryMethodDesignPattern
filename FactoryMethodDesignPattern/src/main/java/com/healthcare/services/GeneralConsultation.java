package com.healthcare.services;

public class GeneralConsultation implements HealthcareService{

    @Override
    public void provideService() {
        System.out.println("Providing general Consultation Service");
    }
}
