package com.example.h03.service;

import com.example.h03.model.VisitingResearcher;
import com.example.h03.service.Interfaces.InstructorServiceIn;

import java.util.List;

public class Visiting_researcherService implements InstructorServiceIn<VisitingResearcher> {
    @Override
    public List<VisitingResearcher> findAll() {
        return null;
    }

    @Override
    public VisitingResearcher findById(int id) {
        return null;
    }

    @Override
    public VisitingResearcher save(VisitingResearcher object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public VisitingResearcher update(VisitingResearcher object) {
        return null;
    }

    @Override
    public VisitingResearcher findByPhoneNumber(String phone_number) {
        return null;
    }

    @Override
    public void deleteByPhoneNumber(String phone_number) {

    }

    @Override
    public VisitingResearcher updateByPhoneNumber(VisitingResearcher visitingResearcher, String phone_number) {
        return null;
    }
}
