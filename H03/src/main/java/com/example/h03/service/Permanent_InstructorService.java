package com.example.h03.service;

import com.example.h03.model.PermanentInstructor;
import com.example.h03.service.Interfaces.InstructorServiceIn;

import java.util.List;

public class Permanent_InstructorService implements InstructorServiceIn<PermanentInstructor> {
    @Override
    public List<PermanentInstructor> findAll() {
        return null;
    }

    @Override
    public PermanentInstructor findById(int id) {
        return null;
    }

    @Override
    public PermanentInstructor save(PermanentInstructor object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public PermanentInstructor update(PermanentInstructor object) {
        return null;
    }

    @Override
    public PermanentInstructor findByPhoneNumber(String phone_number) {
        return null;
    }

    @Override
    public void deleteByPhoneNumber(String phone_number) {

    }

    @Override
    public PermanentInstructor updateByPhoneNumber(PermanentInstructor permanentInstructor, String phone_number) {
        return null;
    }
}
