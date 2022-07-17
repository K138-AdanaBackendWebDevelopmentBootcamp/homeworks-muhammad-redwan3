package com.example.h03.dao;

import com.example.h03.dao.Interface.CourseDaoIn;
import com.example.h03.model.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDAO_JPA implements CourseDaoIn<Course> {
    private final EntityManager entityManager;
    public CourseDAO_JPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("from course",Course.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return entityManager.find(Course.class, (long) id);
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        Course course = entityManager.createQuery("FROM Course c WHERE c.id=:Course_id",Course.class).setParameter("Course_id",id).getSingleResult();
        entityManager.remove(course);
    }

    @Override
    public Course update(Course object) {
        return null;
    }

    @Override
    public void deleteByCode(String code) {
        Course course = entityManager.createQuery("FROM Course c WHERE c.courseCode=:course_code",Course.class).setParameter("course_code",code).getSingleResult();
        entityManager.remove(course);
    }
}
