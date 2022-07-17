package com.example.h03.service.Interfaces;

public interface InstructorServiceIn<Instructor>extends BaseService <Instructor> {
    Instructor findByPhoneNumber(String phone_number);
    void deleteByPhoneNumber(String phone_number);
    Instructor updateByPhoneNumber(Instructor instructor, String phone_number);
}
