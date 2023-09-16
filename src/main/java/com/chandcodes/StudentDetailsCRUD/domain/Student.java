package com.chandcodes.StudentDetailsCRUD.domain;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="student_name")
    private String studentname;
    @Column(name="course_name")
    private String course;
    @Column(name="fee_amount")
    private int fee;

    public Student() {

    }

    public Student(Long id, String studentname, String course, int fee) {
        this.id = id;
        this.studentname = studentname;
        this.course = course;
        this.fee = fee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
