package com.example.h03.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {
    @Id    // the primary key of this object(raw) of the class(table)  // (DB keyword)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name ;
    private LocalDate date;
    private String address;
    private String gender;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Student(long id, String name, LocalDate date, String address, String gender, List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.gender = gender;
        this.courseList = courseList;
    }

    @ManyToMany(targetEntity = Course.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Course> courseList;
    public Student() {

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
