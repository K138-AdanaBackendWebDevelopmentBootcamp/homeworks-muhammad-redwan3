package com.example.h03.service;

import com.example.h03.model.Student;
import com.example.h03.service.Interfaces.StudentServiceIn;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService  implements StudentServiceIn<Student> {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Student update(Student object) {
        return null;
    }
}
