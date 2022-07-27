package com.example.h03.service;

import com.example.h03.dao.StudentDAO_JPA;
import com.example.h03.model.Course;
import com.example.h03.model.Student;
import com.example.h03.service.Interfaces.StudentServiceIn;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService  implements StudentServiceIn<Student> {
    StudentDAO_JPA studentDAO_jpa;

    public StudentService(StudentDAO_JPA studentDAO_jpa) {
        this.studentDAO_jpa = studentDAO_jpa;
    }

    @Override
    public List<Student> findAll() {
        return this.studentDAO_jpa.findAll();
    }

    @Override
    public Student findById(int id) {
        return this.studentDAO_jpa.findById(id);
    }

    @Override
    public Student save(Student object) {

        return (Student) studentDAO_jpa.save(object);
    }

    @Override
    public void deleteById(int id) {
        this.deleteById(id);
    }

    @Override
    public Student update(Student object) {

        return (Student) studentDAO_jpa.update(object);
    }
}
