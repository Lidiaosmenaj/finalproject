package com.project.finalproject.entities;

import jakarta.persistence.*;

@Entity

public class BlockOfClasess {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long blockOfClassesId;
    @ManyToOne
    private Course course;
}
