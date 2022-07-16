package model;

import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity
public class PermanentInstructor extends Instructor {
  private double fixed_salary;

    public PermanentInstructor(String name, String address, String phone_number, List<Course> courseList, double fixed_salary) {
        super(name, address, phone_number, courseList);
        this.fixed_salary = fixed_salary;
    }

    public PermanentInstructor(double fixed_salary) {
        this.fixed_salary = fixed_salary;
    }

    public PermanentInstructor() {

    }

    public double getFixed_salary() {
        return fixed_salary;
    }

    public void setFixed_salary(double fixed_salary) {
        this.fixed_salary = fixed_salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermanentInstructor)) return false;
        return Double.compare(fixed_salary, fixed_salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixed_salary);
    }

    @Override
    public String toString() {
        return "PermanentInstructor{"
                +super.toString()+
                "fixed_salary=" + fixed_salary +
                '}';
    }
}
