package controller;

import model.Course;
import model.Instructor;
import model.Student;
import org.omg.CORBA.PUBLIC_MEMBER;
import service.CourseService;

import java.util.List;

public class CourseController {

    CourseService courseService = new CourseService();

    public List<Course> ListAllCoures()
    {
        return courseService.findAll();
    }
    public Course findById(int id)
    {
        return courseService.findById(id);
    }

    public void saveCourse(Course course)
    {
        courseService.saveToDatabase(course);
    }

    public void updateCourse(Course course,int id)
    {
        courseService.updateOnDatabase(course,id);
    }

    public void deleteCourse(Course course){
        courseService.deleteFromDatabase(course);
    }
    public void deleteCourse(int id){
        courseService.deleteFromDatabase(id);
    }
    public void deleteCourseById(Long id){
        courseService.deleteByCourseId(id);
    }

    public Instructor getCourseInstructor(Course course){
        return  courseService.getInstructor(course);
    }
    public List<Student> getCourseStudentList(Course course){
        return courseService.getStudentList(course);
    }

}
