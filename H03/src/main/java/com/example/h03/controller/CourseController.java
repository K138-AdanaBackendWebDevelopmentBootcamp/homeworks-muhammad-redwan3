package com.example.h03.controller;


import com.example.h03.model.Course;
import com.example.h03.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    @Transactional(readOnly = true)
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/courses/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<Course> getCourseById(@PathVariable int id) {
        return new ResponseEntity<>(courseService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourseById(@PathVariable int id) {
        courseService.deleteById(id);
        return "Deleted...";
    }
}


