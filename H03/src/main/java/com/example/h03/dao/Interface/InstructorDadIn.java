package com.example.h03.dao.Interface;

public interface InstructorDadIn <Instructor> extends BaseDAO<Instructor>{
    Instructor findByPhoneNumber(String phone_number);

    void deleteByPhoneNumber(String phone_number);
    Instructor updateByPhoneNumber(Instructor instructor, String phone_number);
}
