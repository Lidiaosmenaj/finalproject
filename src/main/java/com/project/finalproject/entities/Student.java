package com.project.finalproject.entities;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long studentId;
    private String courseName;
    private boolean studentStatus;
    @Embedded
    private Generality generality;
    public Student() {}

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Generality getGenerality() {
        return generality;
    }

    public void setGenerality(Generality generality) {
        this.generality = generality;
    }
}
