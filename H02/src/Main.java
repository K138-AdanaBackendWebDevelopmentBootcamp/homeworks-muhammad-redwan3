
import controller.CourseController;
import model.Course;
import model.Instructor;
import model.VisitingResearcher;
import utils.EntityManagerUtils;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------------------------");


        EntityManager em = EntityManagerUtils.getEntityManager();

        Course course = new Course();
        course.setCode("0101");
        course.setName("math");
        course.setCredit_score(7);
        course.setStudents(null);
        course.setInstructor(null);

        Course course2 = new Course();
        course2.setCode("0102");
        course2.setName("java");
        course2.setCredit_score(9);
        course2.setInstructor(null);
        course2.setStudents(null);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course);
        courseList.add(course2);

        VisitingResearcher visitingResearcher = new VisitingResearcher();
        visitingResearcher.setHourly_salary(10);
        visitingResearcher.setCourseList(courseList);
        visitingResearcher.setAddress("GAZIANTEP");
        visitingResearcher.setPhone_number("555555555555555");
        course2.setInstructor(visitingResearcher);

        CourseController courseController = new CourseController();
        courseController.saveCourse(course);
        courseController.saveCourse(course2);
    }
}
