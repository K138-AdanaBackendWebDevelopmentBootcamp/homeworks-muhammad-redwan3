package SchoolManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name ;
    private LocalDate date;
    private String address;
    private String gender;
    public Student(String name, LocalDate date, String address, String gender) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.gender = gender;
    }

    private final List<Course> CouresList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return name.equals(student.name) && date.equals(student.date) && address.equals(student.address) && gender.equals(student.gender) && CouresList.equals(student.CouresList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, address, gender, CouresList);
    }

    Student()
    {

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
