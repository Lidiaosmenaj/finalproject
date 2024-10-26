package com.project.finalproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Course {
 @Id
    private Long courseId;

 @ManyToOne
    private User user ;
}
