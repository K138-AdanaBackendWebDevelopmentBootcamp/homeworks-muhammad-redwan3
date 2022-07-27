package com.example.h03.controller;

import com.example.h03.model.Course;
import com.example.h03.model.Student;
import com.example.h03.service.CourseService;
import com.example.h03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    @Transactional(readOnly = true)
    public ResponseEntity<List<Student>> getAllCourses() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<Student> getCourseById(@PathVariable int id) {
        return new ResponseEntity<>(studentService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable int id) {
        studentService.deleteById(id);
        return "Deleted...";
    }
}
