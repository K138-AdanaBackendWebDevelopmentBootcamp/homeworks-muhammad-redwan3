package service;

import model.Course;
import model.Instructor;
import model.Student;
import repository.CourseRepository;
import repository.CrudRepository;
import utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseService implements CrudRepository<Course>, CourseRepository {
    EntityManager em = EntityManagerUtils.getEntityManager();
    @Override
    public void deleteByCourseId(Long id) {
        try {
            em.getTransaction().begin();
            Course course = em.createQuery("from Course where id=:id",Course.class).setParameter("id",id)
                    .getSingleResult();
            em.getTransaction().commit();
        }catch (Exception e)
        {
            e.getMessage();
            em.getTransaction().rollback();
        }
    }

    @Override
    public Instructor getInstructor(Course course) {
        try {
            em.getTransaction().begin();
            Course foundCourse = em.find(Course.class,course.getId());
            return foundCourse.getInstructor();
        }catch (Exception e)
        {
            e.getMessage();
            em.getTransaction().rollback();
        }

        return null;
    }

    @Override
    public List<Student> getStudentList(Course course) {
        try {
            em.getTransaction().begin();
            Course foundCourse = em.find(Course.class,course.getId());
            return foundCourse.getStudents();
        }catch (Exception e)
        {
            e.getMessage();
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public List<Course> findAll() {
        em.getTransaction().begin();
        List<Course> courseList = em.createQuery("from Course ",Course.class).getResultList();

        return courseList;
    }

    @Override
    public Course findById(int id) {
        em.getTransaction().begin();
        Course course = em.find(Course.class,id);
        return course;
    }

    @Override
    public void saveToDatabase(Course object) {
        try {
            em.getTransaction().begin();
            em.persist(object);
        }catch (Exception e)
        {
            e.getMessage();
            em.getTransaction().rollback();
        }finally {
//            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Course object) {
        try {
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        }catch (Exception e)
        {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteFromDatabase(int id) {
        try {
            em.getTransaction().begin();
           Course course =  findById(id);
            em.remove(course);
            em.getTransaction().commit();
        }catch (Exception e)
        {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void updateOnDatabase(Course object, int id) {
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        }catch (Exception e)
        {
            em.getTransaction().rollback();
        }
    }
}
