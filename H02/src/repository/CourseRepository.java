package repository;

import model.Course;
import model.Instructor;
import model.Student;

import java.util.List;

public interface CourseRepository {

    void deleteByCourseId(Long id);
    Instructor getInstructor(Course course);
    List<Student> getStudentList(Course course);
}
