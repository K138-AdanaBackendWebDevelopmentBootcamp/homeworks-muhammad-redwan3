package SchoolManagementSystem;

import java.util.Objects;

public class VisitingResearcher extends Instructor {
    private double hourly_salary;



    public double getHourly_salary() {
        return hourly_salary;
    }

    public void setHourly_salary(double hourly_salary) {
        this.hourly_salary = hourly_salary;
    }

    public VisitingResearcher(String name, String address, String phone_number, double hourly_salary) {
        super(name, address, phone_number);
        this.hourly_salary = hourly_salary;
    }

    public VisitingResearcher(double hourly_salary) {
        this.hourly_salary = hourly_salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VisitingResearcher that)) return false;
        return Double.compare(that.hourly_salary, hourly_salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourly_salary);
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                super.toString()+
                "hourly_salary=" + hourly_salary +
                '}';
    }
}
