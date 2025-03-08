package com.healthcare.services;

public class SpecialistConsultation implements HealthcareService{
    @Override
    public void provideService() {
        System.out.println("Providing Specialist consultation service");
    }
}
