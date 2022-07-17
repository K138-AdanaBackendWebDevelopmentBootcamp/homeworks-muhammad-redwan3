package com.example.h03.service;

import com.example.h03.model.Course;
import com.example.h03.service.Interfaces.CourseServiceIn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseServiceIn<Course> {

    @Override
    public  List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Course update(Course object) {
        return null;
    }

    @Override
    public void deleteByCode(String code) {

    }

    @Override
    public Course updateByCode(Course course, String code) {
        return null;
    }
}
