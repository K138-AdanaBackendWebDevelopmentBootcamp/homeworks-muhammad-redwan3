package com.example.h03.service.Interfaces;

public interface CourseServiceIn<Course> extends BaseService<Course>{
    void deleteByCode(String code);

    Course updateByCode(Course course, String code);
}
