package SchoolManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Student Student_101=new Student("muhammed",LocalDate.of(1995, 4,22),"gaziantep","male");

        Course Course_101 = new Course("Mathematics", "MATH", 8);
        Course Course_102 = new Course("java programming", "java", 6);
        Course Course_103 = new Course("User Experience Design", "ux", 4);
        Course Course_104 = new Course("user interface", "ui", 4);

        List<Course> courseList01 = new ArrayList<>(Arrays.asList(Course_101, Course_104));
        List<Course> courseList02 = new ArrayList<>(Arrays.asList(Course_102, Course_103));

        Instructor Instructor_101 = new PermanentInstructor("Ridvan", "şahinbey", "+905050068524",8530);
        Instructor Instructor_102 = new VisitingResearcher("ahmed", "şahitkamil", "+9050546068524",12530);

        System.out.println(Student_101);
        System.out.println("-------------------------------------");
        System.out.println(courseList01);
        System.out.println("-------------------------------------");
        System.out.println(courseList02);
        System.out.println("-------------------------------------");
        System.out.println(Instructor_101);
        System.out.println("-------------------------------------");
        System.out.println(Instructor_102);
        System.out.println("-------------------------------------");
    }
}
