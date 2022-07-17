package com.example.h03.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private int credit_score;

    @ManyToMany(targetEntity = Student.class,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Student> students;


    @ManyToOne(targetEntity = Instructor.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Instructor instructor;

    public Course(String name, String code, int credit_score, List<Student> students, Instructor instructor) {

        this.name = name;
        this.code = code;
        this.credit_score = credit_score;
        this.students = students;
        this.instructor = instructor;
    }

    public Course(){
    }

    public Long getId() {
        return id;
    }



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", credit_score=" + credit_score +
                ", students=" + students +
                ", instructor=" + instructor +
                '}';
    }
}
