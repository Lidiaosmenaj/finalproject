package com.project.finalproject.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class BlockOfClasses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classID;
    @Column(name = "className", unique = true)
    private String className;


    @ManyToMany(mappedBy = "blockOfClasses")
    private Set<AppUser> userlist;
    /*
    private String klasDesc;
        private String klasType;
        private String klasStatus;
        private String klasDate;
        private String klasLocation;
        private String klasTime;
    */
    private String classDate;
    private String classTopic;

    public BlockOfClasses() {
    }

    public BlockOfClasses(String className, String classDate, String classTopic) {
        this.className = className;
        this.classDate = classDate;
        this.classTopic = classTopic;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int klasId) {
        this.classID = klasId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String klasName) {
        this.className = klasName;
    }

    public String getClassDate() {
        return classDate;
    }

    public void setClassDate(String klasDate) {
        this.classDate = klasDate;
    }

    public String getClassTopic() {
        return classTopic;
    }

    public void setClassTopic(String klasTopic) {
        this.classTopic = klasTopic;
    }

    public Set<AppUser> getUserlist() {
        return userlist;
    }

    public void setUserlist(Set<AppUser> userlist) {
        this.userlist = userlist;
    }
}
