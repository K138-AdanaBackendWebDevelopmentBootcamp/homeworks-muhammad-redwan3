package com.example.h03.dao;

import com.example.h03.dao.Interface.BaseDAO;
import com.example.h03.model.Student;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

public class StudentDAO_JPA implements BaseDAO<Student> {
    private final EntityManager entityManager;

    public StudentDAO_JPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return entityManager.createQuery("from Student",Student.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return (Student) entityManager.createQuery("from Student s WHERE s.id =:student_id")
                .setParameter("student_id", id).getSingleResult();
    }

    @Override
    @Transactional
    public Student save(Student object) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student student =(Student) entityManager.createQuery("from Student s WHERE s.id =:student_id")
                .setParameter("student_id",id).getSingleResult();
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public Student update(Student object) {
        return null;
    }
}
