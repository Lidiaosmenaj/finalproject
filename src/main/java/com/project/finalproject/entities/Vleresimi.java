package com.project.finalproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity

public class Vleresimi {

    @ManyToOne
    private BlockOfClasess blockOfClasess;
}
