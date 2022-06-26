package SchoolManagementSystem;

import java.time.LocalDate;
import java.util.Objects;

public class Course {

    private String name ;
    private String code;
    private int credit_score;

    Instructor Instructor;

    public SchoolManagementSystem.Instructor getInstructor() {
        return Instructor;
    }

    public void setInstructor(SchoolManagementSystem.Instructor instructor) {
        Instructor = instructor;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Course)) return false;
//        Course course = (Course) o;
//        return name.equals(course.name) && code.equals(course.code) && credit_score.equals(course.credit_score) && Instructor.equals(course.Instructor);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, credit_score, Instructor);
    }

    @Override
    public String toString() {
        String instructor_name = Instructor!= null ? Instructor.getName():"null";
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", credit_score='" + credit_score + '\'' +
                ", instructor=" +instructor_name+
                '}';
    }

    public Course(String name, String code, int credit_score) {
        this.name = name;
        this.code = code;
        this.credit_score = credit_score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(int credit_score) {
        this.credit_score = credit_score;
    }
}
