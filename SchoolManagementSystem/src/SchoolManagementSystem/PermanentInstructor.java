package SchoolManagementSystem;

import java.util.Objects;

public class PermanentInstructor extends Instructor {
  private double fixed_salary;

    public PermanentInstructor(String name, String address, String phone_number, double fixed_salary) {
        super(name, address, phone_number);
        this.fixed_salary = fixed_salary;
    }

    public PermanentInstructor(double fixed_salary) {
        this.fixed_salary = fixed_salary;
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
        if (!(o instanceof PermanentInstructor that)) return false;
        return Double.compare(that.fixed_salary, fixed_salary) == 0;
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
