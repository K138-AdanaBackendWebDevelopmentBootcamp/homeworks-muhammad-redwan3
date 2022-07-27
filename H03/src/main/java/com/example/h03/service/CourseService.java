package com.example.h03.service;

import com.example.h03.dao.CourseDAO_JPA;
import com.example.h03.model.Course;
import com.example.h03.service.Interfaces.CourseServiceIn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseServiceIn<Course> {

    CourseDAO_JPA courseDAO_jpa;

    public CourseService(CourseDAO_JPA courseDAO_jpa) {
        this.courseDAO_jpa = courseDAO_jpa;
    }

    @Override
    public  List<Course> findAll() {
        return courseDAO_jpa.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseDAO_jpa.findById(id);
    }

    @Override
    public Course save(Course object) {
        return (Course) courseDAO_jpa.save(object);
    }

    @Override
    public void deleteById(int id) {
        courseDAO_jpa.deleteById(id);
    }

    @Override
    public Course update(Course object) {
        return (Course) courseDAO_jpa.update(object);
    }

    @Override
    public void deleteByCode(String code) {
            courseDAO_jpa.deleteByCode(code);
    }

    @Override
    public Course updateByCode(Course course, String code) {
        return null;
    }
}
