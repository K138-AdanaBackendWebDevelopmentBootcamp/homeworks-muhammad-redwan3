package com.example.h03.model;


import javax.persistence.*;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone_number;

    @OneToMany(targetEntity = Course.class,fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Course> CourseList;

    public Instructor(String name, String address, String phone_number, List<Course> courseList) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        CourseList = courseList;
    }

    public Instructor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }


    public List<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(List<Course> courseList) {
        if (courseList.size()>0)
        {
            CourseList = courseList;
        }
    }
}

