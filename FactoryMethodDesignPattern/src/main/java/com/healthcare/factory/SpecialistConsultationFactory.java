package com.healthcare.factory;

import com.healthcare.services.HealthcareService;
import com.healthcare.services.SpecialistConsultation;

public class SpecialistConsultationFactory implements HealthcareServiceFactory{
    @Override
    public HealthcareService createHealthcareService() {
        return new SpecialistConsultation();
    }
}
